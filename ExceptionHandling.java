import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("That's not an integer. Try again.");
                scanner.next(); // clear the invalid input
            }
        }

        System.out.println("You entered: " + number);
    }
}
