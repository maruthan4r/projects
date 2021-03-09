import javax.swing.*;
import java.util.Random;

public class Automat {
    Preisgeld preisgeld = new Preisgeld();


    public static void main(String[] args){
        Automat automat = new Automat();
        automat.run();

    }

    public void run(){
        /* Fragt ob man einen Spin machen möchte oder nicht. */

        int jaNein= JOptionPane.showConfirmDialog(null, "Spin", "Merkur-Sonne", JOptionPane.YES_NO_OPTION);

        while (jaNein==0){
            spin();

            jaNein= JOptionPane.showConfirmDialog(null, "Nochmal?", "Merkur-Sonne", JOptionPane.YES_NO_OPTION);
        }
        System.out.println("Auf wiedersehen.");

/**
        if (JOptionPane.YES_NO_OPTION==0){
            spin();
        } else if (JOptionPane.YES_NO_OPTION==1){
            System.out.println("Auf wiedersehen.");
        } else {
            System.out.println("adios.");
        }
**/
    }



    public void spin(){
        System.out.println("Spin beginnt.");


        Random random = new Random();

        int zahl1= random.nextInt(7);
        int zahl2= random.nextInt(7);
        int zahl3= random.nextInt(7);

/**
 int zahl1=7;
 int zahl2=7;
 int zahl3=6;
 */

        if (zahl1==7 && zahl2==7 && zahl3==7) {
            System.out.println("Sie haben gewonnen!!!!");
            System.out.println("Gewinn: "+ preisgeld.preisgeld(zahl1));
        } else {
            System.out.println("Sie habben verloren. Vielleicht nächstes mal. ");
        }


    }

}
