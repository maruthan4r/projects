import java.util.Scanner;

public class a52 {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public a52() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        a52 program = new a52();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        // TODO: realize the program logic


        System.out.println("rotwert eingben(0.0-1.0");

        double rot =scanner.nextDouble();

        while (rot<0.0|| rot>1){

            System.out.println("falsch");

            scanner.next();
            rot = scanner.nextDouble();
        }


        double blau =scanner.nextDouble();

        while (blau<0.0|| blau>1){

            System.out.println("falsch");

            scanner.next();
            blau = scanner.nextDouble();
        }

        double gruen =scanner.nextDouble();

        while (gruen<0.0|| gruen>1){

            System.out.println("falsch");

            scanner.next();
            gruen = scanner.nextDouble();
        }
        System.out.println("ok");

    }
}