public class Book {
    private String title;
    private int numberOfPages;
    private String genre;
    private Writer author;

    public Book(String title, int numberOfPages, String genre, Writer author) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public Writer getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return numberOfPages == book.numberOfPages &&
                title.equals(book.title) &&
                genre.equals(book.genre) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + numberOfPages;
        result = 31 * result + genre.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", genre='" + genre + '\'' +
                ", author=" + author +
                '}';
    }
}
