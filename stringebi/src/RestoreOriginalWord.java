import java.util.Scanner;

public class RestoreOriginalWord {
    public static String restoreWord(String modifiedWord) {
        StringBuilder originalWord = new StringBuilder();

        for (int i = 0; i < modifiedWord.length(); i++) {
            if (i == 0 || modifiedWord.charAt(i) != modifiedWord.charAt(i - 1)) {
                originalWord.append(modifiedWord.charAt(i));
            }
        }

        return originalWord.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the modified word: ");
        String modifiedWord = scanner.nextLine().trim();

        scanner.close();

        System.out.println("Original word: " + restoreWord(modifiedWord));
    }
}
