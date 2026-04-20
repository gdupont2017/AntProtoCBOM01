import java.security.*;
import javax.crypto.*;
public class JavaAppAntProtoCBOM01 {
    public static void main(String[] args) throws Exception {
        MessageDigest md;
        md = MessageDigest.getInstance("MD5");
        md = MessageDigest.getInstance("SHA1");
        md = MessageDigest.getInstance("SHA256");
        md = MessageDigest.getInstance("SHA3-512");
        KeyGenerator kg ;
        kg = KeyGenerator.getInstance("DES");
        kg = KeyGenerator.getInstance("AES");
        KeyPairGenerator kpg;
        kpg = KeyPairGenerator.getInstance("RSA");
        kpg = KeyPairGenerator.getInstance("DH");
        kpg = KeyPairGenerator.getInstance("ML-DSA");
        kpg = KeyPairGenerator.getInstance("ML-KEM");
    }
}