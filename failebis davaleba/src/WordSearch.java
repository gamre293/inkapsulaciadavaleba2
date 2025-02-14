import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String searchWord = scanner.next().trim();

        String fileName = "output.txt";
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[\\s,;]+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            if (found) {
                System.out.println("The word '" + searchWord + "' is present in the file.");
            } else {
                System.out.println("The word '" + searchWord + "' was not found in the file.");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        scanner.close();
    }
}
