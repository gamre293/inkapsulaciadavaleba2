import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();

        scanner.close();

        if (input.isEmpty()) {
            System.out.println("The string is empty.");
            return;
        }

        char lastChar = Character.toLowerCase(input.charAt(input.length() - 1));

        if (!Character.isLetter(lastChar)) {
            System.out.println("The last character is not a letter.");
            return;
        }

        String vowels = "aeiou";

        if (vowels.indexOf(lastChar) != -1) {
            System.out.println("The string ends with a vowel.");
        } else {
            System.out.println("The string ends with a consonant.");
        }
    }
}
