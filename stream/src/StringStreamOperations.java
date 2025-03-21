import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamOperations {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "hello", "Jack", "world", "Jupiter", "coding", "Jungle");

        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Filtered and Uppercase Words: " + filteredWords);
    }
}
