import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Block {
    String souvenir;// a modified adress of the previous block
    String adress;
    Vector<Transaction> transactions;


    public Block(Vector<Integer> unificators) throws Exception {
        transactions = new Vector<Transaction>();

        Collections.sort(unificators);
        /*
//CASE CLOSED!
//TEST: Does it sort?
        System.out.println("Sorted Vector: "+unificators);
//TEST: Does it return the biggest Value?
        System.out.println("Biggest Value in Vector: "+unificators.get(unificators.size()-1));
*/

        /***
         * A collection of unique numbers is stored in the Core(Core.java).
         * To create a Block the collection will be given to the constructor.
         * A random number will be picked and from this number and with the souvenir will the new adress be created.
         * As soon the number is used the number will get removed.
         *
         */

        //Start of hashing
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(adress.getBytes(StandardCharsets.UTF_8));
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < hash.length; i++) {
            hexString.append(Integer.toHexString(0xFF & hash[i]));
        }
        System.out.println("Hex format : " + hexString.toString());
        //End of hashing
    }


    public String getAdress() {
        return adress;
    }

    public String getSouvenir() {
        return souvenir;
    }

    public Vector<Transaction> getTransactions() {
        return transactions;
    }

    public void setSouvenir(String souvenir) {
        this.souvenir = souvenir;
    }

    public static void main(String[] args) {
        Vector<Integer> sampleVector = new Vector<Integer>();
        Random random = new Random();
        sampleVector.add(random.nextInt(100));
        sampleVector.add(random.nextInt(100));
        sampleVector.add(random.nextInt(100));
        sampleVector.add(random.nextInt(100));
        sampleVector.add(random.nextInt(100));
        sampleVector.add(random.nextInt(100));
        sampleVector.add(random.nextInt(100));
        sampleVector.add(random.nextInt(100));
        sampleVector.add(random.nextInt(100));

        try {
            Block sample = new Block(sampleVector);
        } catch (Exception e) {
            System.out.println("A problem has occured");
        }
    }
}
