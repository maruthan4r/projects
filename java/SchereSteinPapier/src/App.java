import java.util.Random;
import java.util.Scanner;

public class App {

    String [] auswahl = {"Schere","Stein","Papier"};
    int eingabe;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args){
        App app = new App();
        app.run();
    }

    public void run(){
        System.out.println("Schere,Stein,Papier!");
        System.out.println("0=Schere");
        System.out.println("1=Stein");
        System.out.println("2=Papier");

        while (!scanner.hasNextInt()||scanner.nextInt()>2||scanner.nextInt()<0) {
            scanner.next();
            System.out.println("Bitte eine Zahl von 0-2 eingeben!");
            System.out.print("> ");
        }

        int eingabe = scanner.nextInt();


        int eingabe2 = random.nextInt(2);

        /***
         * Schere=0
         * Stein=1
         * Papier=2
         *
         *
         * Schere gegen Schere  :unentschieden
         * Schere gegen Stein   :verloren
         * Schere gegen Papier  :gewonnen
         *
         * Stein gegen Stein    :unentschieden
         * Stein gegen Papier   :verloren
         * Stein gegen Schere   :gewonnen
         *
         * Papier gegen Papier  :unentschieden
         * Papier gegen Schere  :verloren
         * Papier gegen Stein   :gewonnen
         *
         *
         */

        if (eingabe==0 && eingabe2==0){



            //unterschieden
            System.out.println(auswahl[0] + " gegen " + auswahl[0] +", unentschieden.");
        } else if (eingabe==1 && eingabe2==1) {
            System.out.println(auswahl[1] + " gegen " + auswahl[1] +", unentschieden.");
        } else if (eingabe==2 && eingabe2==2) {
            System.out.println(auswahl[2] + " gegen " + auswahl[2] +", unentschieden.");

            //Schere=0
        } else if (eingabe==0 && eingabe2==1) {
            System.out.println(auswahl[0] + " gegen " + auswahl[1]+", verloren.");
        } else if (eingabe==0 && eingabe2==2) {
            System.out.println(auswahl[0] + " gegen " + auswahl[2]+", gewonnen.");

            //Stein=1
        } else if (eingabe==1 && eingabe2==2) {
            System.out.println(auswahl[1] + " gegen " + auswahl[2]+", verloren.");
        } else if (eingabe==1 && eingabe2==0) {
            System.out.println(auswahl[1] + " gegen " + auswahl[0]+", gewonnen.");

            //Papier=2
        } else if (eingabe==2 && eingabe2==0) {
            System.out.println(auswahl[2] + " gegen " + auswahl[0]+", verloren.");
        } else if (eingabe==2 && eingabe2==1) {
            System.out.println(auswahl[2] + " gegen " + auswahl[1] + ", gewonnen.");
        }


    }

}
