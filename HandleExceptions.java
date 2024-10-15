import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptions {
    public static void main(String[] args) {
	    int count = 0;
	    double sum = 0.0;
        try {
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
		if(scanner.hasNextInt()) {
		sum += (double) scanner.nextInt(); 
		count++;
		} else if (scanner.hasNextDouble()) {
	        sum += scanner.nextDouble();
		count++; //make	
		}
            }
            System.out.println("Sum of numbers: " + sum);
            scanner.close();
	    System.out.println("average is:" + sum/count);	
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (InputMismatchException e) {
            System.out.println("File contains non-integer values.");
        }
    }
}
//Modify - It throws the "File contains non-integer values"
