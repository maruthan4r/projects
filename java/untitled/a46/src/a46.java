import java.util.Scanner;

public class a46 {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public a46() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        a46 program = new a46();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        // TODO: realize the program logic
        double a;
        double b;
        double c;
        double x=2;
        double y;

        double start;
        double end;


        System.out.println("a eingeben::");

         a =scanner.nextDouble();

        System.out.println("b eingeben::");

         b =scanner.nextDouble();

        System.out.println("c eingeben::");

         c =scanner.nextDouble();

        System.out.println("start des Intervalls  eingeben::");

        start =scanner.nextDouble();

        System.out.println("Ende eingeben::");

        System.out.println("Schritt eingeben");

        double intervall = scanner.nextDouble();

        end =scanner.nextDouble();

        y=(a*x)+(b*x)+c;


        System.out.println("Lösung:" + y);

        for (double i=start ; i<=end; i=i+intervall){

            System.out.println(i);

        }



    }
}