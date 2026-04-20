import java.security.KeyPairGenerator;
public class JavaAppAntProtoCBOM01 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator kpg;
        kpg = KeyPairGenerator.getInstance("RSA");
        kpg = KeyPairGenerator.getInstance("DH");
        kpg = KeyPairGenerator.getInstance("ML-DSA");
        kpg = KeyPairGenerator.getInstance("ML-KEM");
    }
}
