import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        if (1 == 0) { //False condition so that original code does not run
            Scanner scanner = new Scanner(System.in);
            int number = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter an integer: ");
                    number = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    //Modify - displays error  message
                    System.out.println("ERROR: NOT AN INTEGER");
                    //Modify - exit the program after displaying message
                    System.exit(0); 
                }
            }

            System.out.println("You entered: " + number);
    }
    //MAKE CODE
    //uses same logic as original with some changes for this situation
    Scanner doubleScanner = new Scanner(System.in);
    double makeNumber = 0;
    boolean makeValidInput = false;

    while (!makeValidInput) {
        try {
            System.out.print("Enter a double: ");
            //Scanner scans for double instead of integer
            makeNumber = doubleScanner.nextDouble();
            makeValidInput = true;
        } catch (InputMismatchException e) {
            System.out.println("ERROR: NOT A DOUBLE VALUE");
            System.exit(0);
        }
     }
     }
}
