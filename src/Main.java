import java.math.BigInteger;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        RSA rsa = new RSA("pubkey.rsa", "privkey.rsa");
        rsa.readPublicKey("joakimpub.rsa");
        // rsa.savePublicKey("pubkey.rsa");
        // rsa.savePrivateKey("privkey.rsa");
 
        //rsa.encrypt("Möt mig vid stora eken i gryningen", "Encrypted.rsa");
        String message = rsa.decrypt("Encrypted.rsa");
        System.out.println(message);
    }
}