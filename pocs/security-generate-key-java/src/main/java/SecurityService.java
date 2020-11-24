import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

public class SecurityService {

    public static SecretKey importKey(byte[] data){
        return new SecretKeySpec(data, "AES");
    }

    public static KeyPair generateAsymmetricKey(){
        try{
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(4096);
            KeyPair pair = keyGen.generateKeyPair();
            return pair;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public static SecretKey generateKey(){
        try{
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");

            SecureRandom secureRandom = new SecureRandom();
            int keyBitSize = 256;
            keyGenerator.init(keyBitSize, secureRandom);

            SecretKey secretKey = keyGenerator.generateKey();
            return secretKey;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public static String enc(String data,SecretKey key){
       try{
           byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
           IvParameterSpec ivspec = new IvParameterSpec(iv);
           Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
           cipher.init(Cipher.ENCRYPT_MODE, key,ivspec);
           byte[] encData = cipher.doFinal(data.getBytes("UTF-8"));;
           return Base64.getEncoder().encodeToString(encData);
       }catch(Exception e){
           throw new RuntimeException(e);
       }
    }

    public static String dec(String text,SecretKey key) {
        try {
            byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            IvParameterSpec ivspec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key,ivspec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(text)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String encRSA(String data, KeyPair key){
        try{
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, key.getPrivate());
            byte[] encData = cipher.doFinal(data.getBytes("UTF-8"));;
            return Base64.getEncoder().encodeToString(encData);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public static String decRSA(String text, KeyPair key) {
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, key.getPublic());
            return new String(cipher.doFinal(Base64.getDecoder().decode(text)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String generateHash(String password){
        try{
            MessageDigest algorithm = MessageDigest.getInstance("SHA-512");
            byte[] messageDigest = algorithm.digest(password.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            return hexString.toString();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
