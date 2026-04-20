import java.security.KeyPairGenerator;
public class JavaAppAntProtoCBOM01 {
    public static void main(String[] args) throws Exception {
        String tabAlgoAsym[]={"DSA","ML-DSA-87","ML-DSA-65","ML-DSA-44",
            "ML-DSA","RSA","RSASSA-PSS","EC","X448","X25519","Ed25519",
            "Ed448","EdDSA","XDH","ML-KEM-1024","ML-KEM-512","ML-KEM-768",
            "DiffieHellman","ML-KEM"};
        for(int i=0;i<tabAlgoAsym.length;i++){
            KeyPairGenerator kpg = KeyPairGenerator.getInstance(tabAlgoAsym[i]);
            System.out.println(kpg.getAlgorithm());
        }
    }
}