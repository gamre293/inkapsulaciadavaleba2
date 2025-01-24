import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //1
//        Writer writer1 = new Writer("J.K.", "Rowling");
//        Writer writer2 = new Writer("George", "Orwell");
//        Writer writer3 = new Writer("J.R.R.", "Tolkien");
//
//        Book[] books = {
//                new Book("Harry Potter", 500, "Fantasy", writer1),
//                new Book("1984", 328, "Dystopian", writer2),
//                new Book("The Hobbit", 310, "Fantasy", writer3)
//        };
//
//        for (Book book : books) {
//            System.out.println(book);
//        }

        //2
//        Fraction[] fractions = {
//                new Fraction(1, 2),
//                new Fraction(2, 4),
//                new Fraction(3, 6),
//                new Fraction(3, 4),
//                new Fraction(6, 8),
//                new Fraction(1, 2)
//        };
//
//        System.out.println("Fractions:");
//        for (Fraction fraction : fractions) {
//            System.out.println(fraction);
//        }
//
//        Map<Fraction, Integer> fractionCount = new HashMap<>();
//        for (Fraction fraction : fractions) {
//            fractionCount.put(fraction, fractionCount.getOrDefault(fraction, 0) + 1);
//        }
//
//        int equalFractions = 0;
//        for (int count : fractionCount.values()) {
//            if (count > 1) {
//                equalFractions += count - 1;
//            }
//        }
//
//        System.out.println("\nNumber of equal fractions: " + equalFractions);

        //3
        QuadraticEquation[] equations = {
                new QuadraticEquation(1, -3, 2),   // Solutions: x1=2, x2=1
                new QuadraticEquation(1, -2, 1),   // Solutions: x1=1 (double root)
                new QuadraticEquation(1, 4, 4),    // Solutions: x1=-2 (double root)
                new QuadraticEquation(1, 3, 2),    // Solutions: x1=-1, x2=-2
                new QuadraticEquation(1, -3, 2),   // Solutions: x1=2, x2=1 (duplicate of first)
                new QuadraticEquation(1, 1, 1)     // No real solutions
        };

        System.out.println("Quadratic Equations:");
        for (QuadraticEquation equation : equations) {
            System.out.println(equation);
        }

        Map<QuadraticEquation, Integer> equationCount = new HashMap<>();
        for (QuadraticEquation equation : equations) {
            equationCount.put(equation, equationCount.getOrDefault(equation, 0) + 1);
        }

        int equalEquations = 0;
        for (int count : equationCount.values()) {
            if (count > 1) {
                equalEquations += count - 1;
            }
        }

        System.out.println("\nNumber of equal equations: " + equalEquations);
    }
}