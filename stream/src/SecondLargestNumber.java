import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 25, 30, 30, 18, 22);

        Optional<Integer> secondLargest = numbers.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst();

        secondLargest.ifPresentOrElse(
                num -> System.out.println("Second largest number: " + num),
                () -> System.out.println("No second largest number found")
        );
    }
}
