import java.util.*;

class BookAdvisor extends LibraryEmployee {
    private double recommendationRating;
    private String libraryName;
    private List<Book> libraryBooks;

    public BookAdvisor(String firstName, String lastName, int id, double recommendationRating, String libraryName, List<Book> libraryBooks) {
        super(firstName, lastName, id);
        this.recommendationRating = recommendationRating;
        this.libraryName = libraryName;
        this.libraryBooks = libraryBooks;
    }

    public double getRecommendationRating() {
        return recommendationRating;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public Book recommendBook() {
        Random random = new Random();
        return libraryBooks.get(random.nextInt(libraryBooks.size()));
    }
}

