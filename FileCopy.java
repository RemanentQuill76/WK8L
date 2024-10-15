import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileCopy {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(new File("destination.txt"));
            Scanner scanner = new Scanner(new File("source.txt"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line);
            }

            scanner.close();
            writer.close();


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        try {
            File usersFile = new File("userInput.txt");
        
            PrintWriter transfer = new PrintWriter(usersFile);
            Scanner userScanner = new Scanner(System.in);
            System.out.println("Input the sentence you want put in a file: ");
            String input = userScanner.nextLine();
            transfer.println(input);
            transfer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found to transfer into. Make a user" + 
                    "Input.txt file");
        }
    }
}
