import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;

public class SecretsManagerService {

    private AWSSecretsManager client;

    public SecretsManagerService(){
        String region = Regions.US_EAST_1.getName();
        // String endpoint = "secretsmanager." + region + ".amazonaws.com";
        String endpoint = "http://localhost:4566";

        AwsClientBuilder.EndpointConfiguration config = new AwsClientBuilder.EndpointConfiguration(endpoint, region);
        AWSSecretsManagerClientBuilder clientBuilder = AWSSecretsManagerClientBuilder.standard();
        clientBuilder.setEndpointConfiguration(config);
        client = clientBuilder.build();
    }

    public String getSecret(String secretName){
        String secret = null;
        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest().withSecretId(secretName);
        GetSecretValueResult getSecretValueResponse = null;
        try {
            getSecretValueResponse = client.getSecretValue(getSecretValueRequest);
            if(getSecretValueResponse.getSecretString() != null)
                secret = getSecretValueResponse.getSecretString();
            else
                secret = getSecretValueResponse.getSecretBinary().toString();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        return secret;
    }
}
