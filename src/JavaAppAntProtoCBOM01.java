import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.NamedParameterSpec;

public class JavaAppAntProtoCBOM01 {

    public static void main(String[] args) throws Exception {
        String algo1="RSA";
        String algo2="ML-KEM";
        KeyPairGenerator kpg1 = KeyPairGenerator.getInstance(algo1);
        System.out.println(kpg1.getAlgorithm()); // RSA
        KeyPairGenerator kpg2 = KeyPairGenerator.getInstance("ML-KEM");
        System.out.println(kpg2.getAlgorithm()); // ML-KEM
        kpg2.initialize(new NamedParameterSpec("ML-KEM-768"));
//        kpg2.initialize(new NamedParameterSpec("ML-KEM-1024"));
        KeyPair kp2 = kpg2.generateKeyPair();
        System.out.println("Public key size: " + kp2.getPublic().getEncoded().length + " bytes");
        System.out.println("Private key size: " + kp2.getPrivate().getEncoded().length + " bytes");
    }
}