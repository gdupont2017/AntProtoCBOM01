import java.security.KeyPairGenerator;
public class JavaAppAntProtoCBOM01 {
    public static void main(String[] args) throws Exception {
        String tabAlgo[]={"RSA","DH","RSA","RSA","ML-KEM","ML-DSA"};
        for(int i=0;i<tabAlgo.length;i++){
            KeyPairGenerator kpg = KeyPairGenerator.getInstance(tabAlgo[i]);
            System.out.println(kpg.getAlgorithm());
        }
    }
}