import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(new ScienceBook("Physics Fundamentals", 300, "John Doe", true, "Physics"));
        libraryBooks.add(new FantasyBook("Greek Myths", 250, "Jane Smith", false, "Greece"));

        BookAdvisor advisor = new BookAdvisor("Alice", "Johnson", 1, 4.5, "City Library", libraryBooks);
        System.out.println("Recommended Book: " + advisor.recommendBook().getTitle());

        Book book = new ScienceBook("Biology Basics", 400, "Sarah Lee", true, "Biology");
        book.read();
    }
}