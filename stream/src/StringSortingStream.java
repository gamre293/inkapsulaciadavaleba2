import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StringSortingStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Mango", "Orange", "Grape", "Peach");

        Set<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Sorted Words: " + sortedWords);
    }
}
