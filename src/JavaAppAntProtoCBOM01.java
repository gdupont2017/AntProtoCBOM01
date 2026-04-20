import java.security.KeyPairGenerator;

public class JavaAppAntProtoCBOM01 {

    public static void main(String[] args) throws Exception {
        //
        //
        String algo="RSA";
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algo);
        System.out.println(keyPairGenerator.getAlgorithm()); //RSA
    }
}