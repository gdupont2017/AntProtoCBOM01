import java.security.KeyPairGenerator;

public class JavaAppAntProtoCBOM01 {

    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        System.out.println(keyPairGenerator.getAlgorithm()); //RSA
    }
}