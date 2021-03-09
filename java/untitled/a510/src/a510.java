import java.util.Scanner;

public class a510 {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public a510() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        a510 program = new a510();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        // TODO: realize the program logic

        System.out.println("Kmh eingeben");

        double kmh=scanner.nextDouble();

        double ms= kmh/3.6;

    }


    public double reaktionszeit(double ms, double bremsbeschleunigung){

    }

    
}