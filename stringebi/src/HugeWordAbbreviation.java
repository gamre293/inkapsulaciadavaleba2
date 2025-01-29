import java.util.Scanner;

public class HugeWordAbbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().trim();

        scanner.close();

        if (word.length() > 10) {
            String abbreviation = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
            System.out.println("Abbreviation: " + abbreviation.toUpperCase());
        } else {
            System.out.println("The word is not huge.");
        }
    }
}
