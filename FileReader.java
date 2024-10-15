import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileReader {
    public static void main(String[] args) {
        File wordFile = new File("word.txt");
        File file = new File("numbers.txt");
        double sum = 0;
        int count = 0;
        ArrayList<String> words = new ArrayList<String>();
        
        try {
            Scanner scanner = new Scanner(file);
            Scanner wordScanner = new Scanner(wordFile);
            while (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                count++;
            }
            while (wordScanner.hasNextLine()) {
                words.add(0,wordScanner.nextLine());
            }
           
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }

        System.out.println("Your reversed words:");
        
        for(String i : words) {
            System.out.println(i);
        }


        double average = sum / count;
        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);
    }
}
