import java.util.Scanner;

public class a51 {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public a51() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        a51 program = new a51();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        // TODO: realize the program logic
        System.out.println("Zahl eingeben: ");
        double zahl=scanner.nextDouble();

        if (istUngerade(zahl)){
            System.out.println("GERADE");

        }else{
            System.out.println("UNGERADE");
        }



    }


    public boolean istUngerade(double zahl){

       if (zahl%2==0){
           return true;

       }else {
           return false;
       }

    }


}