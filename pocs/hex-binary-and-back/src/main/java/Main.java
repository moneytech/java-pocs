import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Base64;

/*
*  HEX to Bin, Dec and Base64 and back.
*
*  HEX           = 1234ABCD12AB34CD56EF1234567890AB
*  HEX size      = 32
*  BIN           = 10010001101001010101111001101000100101010101100110100110011010101011011101111000100100011010001010110011110001001000010101011 HEX BACK: 1234abcd12ab34cd56ef1234567890ab
*  BYTE[]        = [B@65b54208 size: 16 HEX BACK = 1234ABCD12AB34CD56EF1234567890AB
*  BYTE[] to B64 = EjSrzRKrNM1W7xI0VniQqw== size: 24 HEX BACK = 1234ABCD12AB34CD56EF1234567890AB
*  DEC           = 24199587900365542451626017331269374123 HEX BACK: 1234ABCD12AB34CD56EF1234567890AB
*****************
*  Hex to Byte[] to Base64 String in 1 ms [EjSrzRKrNM1W7xI0VniQqw==]
*  Base64 String to Byte[] to Hex String in 0 ms [1234ABCD12AB34CD56EF1234567890AB]
*
**/
public class Main {

    public static void main(String args[]) throws Exception{
        String hex = "1234abcd12ab34cd56ef1234567890ab".toUpperCase();
        System.out.println("HEX           = " + hex);
        System.out.println("HEX size      = " + hex.length());
        System.out.println("BIN           = " + hexToBinary(hex) + " HEX BACK: " + binToHex(hexToBinary(hex)) );
        System.out.println("BYTE[]        = " + hexStringToByteArray(hex) + " size: " + hexStringToByteArray(hex).length + " HEX BACK = " + byteArrayToHexStr(hexStringToByteArray(hex))  );
        System.out.println("BYTE[] to B64 = " + byteArrayToBase64(hexStringToByteArray(hex)) + " size: " + byteArrayToBase64(hexStringToByteArray(hex)).length() + " HEX BACK = " + byteArrayToHexStr(base64ToByteArray(byteArrayToBase64(hexStringToByteArray(hex))) ) );
        System.out.println("DEC           = " + binToDec(hexToBinary(hex)) + " HEX BACK: " + decToHex(binToDec(hexToBinary(hex))) );
        System.out.println("*****************");

        Long init = System.currentTimeMillis();
        String b64Str = byteArrayToBase64(hexStringToByteArray(hex));
        Long end = System.currentTimeMillis();
        System.out.println("Hex to Byte[] to Base64 String in " + (end-init) + " ms [" + b64Str + "]");

        init = System.currentTimeMillis();
        String hexBack = byteArrayToHexStr(base64ToByteArray(b64Str));
        end = System.currentTimeMillis();
        System.out.println("Base64 String to Byte[] to Hex String in " + (end-init) + " ms [" + hexBack + "]");

    }

    public static byte[] hexStringToByteArray(String s) {
        byte[] byteArray = new BigInteger(s, 16)
                .toByteArray();
        if (byteArray[0] == 0) {
            byte[] output = new byte[byteArray.length - 1];
            System.arraycopy(
                    byteArray, 1, output,
                    0, output.length);
            return output;
        }
        return byteArray;
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static String byteArrayToHexStr(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    private static String binToHex(String binaryString) {
        return new BigInteger(binaryString, 2).toString(16);
    }

    private static String hexToBinary(String hex) {
        return new BigInteger(hex, 16).toString(2);
    }

    private static String binToDec(String binaryString) {
        BigDecimal bd1 = new BigDecimal(binaryString.charAt(0)=='1'?1:0);
        BigDecimal two = new BigDecimal(2);
        for (int i = 1; i<binaryString.length(); i++) {
            bd1 = bd1.multiply(two);
            bd1 = bd1.add(new BigDecimal(binaryString.charAt(i)=='1'?1:0));
        }
        return bd1.toString();
    }

    private static String byteArrayToBase64(byte[] a) {
        try {
            return new String(Base64.getEncoder().encode(a), "UTF-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] base64ToByteArray(String base64Str) {
        try {
            return Base64.getDecoder().decode(base64Str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String decToHex(String dec) {
        BigDecimal bd = new BigDecimal(dec);
        return String.format("%X", bd.toBigInteger());
    }

}
