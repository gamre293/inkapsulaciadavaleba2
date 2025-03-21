import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 10, 15, 20, 5, 12, 8, 25);

        int sum = numbers.stream()
                .filter(n -> n >= 10)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squared numbers: " + sum);
    }
}
