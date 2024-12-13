import java.util.Arrays;

public class Library {
    public Library(String cityLibrary, LibraryEmployee[] libraryEmployees, Book[] books) {
    }
    //2
//    public static void main(String[] args) {
//        List<Book> libraryBooks = new ArrayList<>();
//        libraryBooks.add(new ScienceBook("Physics Fundamentals", 300, "John Doe", true, "Physics"));
//        libraryBooks.add(new FantasyBook("Greek Myths", 250, "Jane Smith", false, "Greece"));
//
//        BookAdvisor advisor = new BookAdvisor("Alice", "Johnson", 1, 4.5, "City Library", libraryBooks);
//        System.out.println("Recommended Book: " + advisor.recommendBook().getTitle());
//
//        Book book = new ScienceBook("Biology Basics", 400, "Sarah Lee", true, "Biology");
//        book.read();
//    }
//}

    //3
//    private String libraryName;
//    private LibraryEmployee[] employees;
//    private Book[] books;
//
//    public Library(String libraryName, LibraryEmployee[] employees, Book[] books) {
//        this.libraryName = libraryName;
//        this.employees = employees;
//        this.books = books;
//    }
//
//    public String getLibraryName() {
//        return libraryName;
//    }
//
//    public LibraryEmployee[] getEmployees() {
//        return employees;
//    }
//
//    public Book[] getBooks() {
//        return books;
//    }
//
//    public static void main(String[] args) {
//
//        Book book1 = new ScienceBook("Physics Fundamentals", 300, "John Doe", true, "Physics");
//        Book book2 = new FantasyBook("Greek Myths", 250, "Jane Smith", false, "Greece");
//        Book book3 = new AdventureBook("Jungle Adventures", 200, "Mark Twain", true);
//
//        LibraryEmployee employee1 = new Bookkeeper("Alice", "Brown", 1);
//        LibraryEmployee employee2 = new BookIssuer("Bob", "White", 2, "9:00 AM", "5:00 PM");
//        LibraryEmployee employee3 = new SilenceController("Charlie", "Green", 3, 8.5);
//        LibraryEmployee employee4 = new BookAdvisor("Diana", "Black", 4, 4.7, "City Library", Arrays.asList(book1, book2, book3));
//
//        Library library = new Library(
//                "City Library",
//                new LibraryEmployee[] {employee1, employee2, employee3, employee4},
//                new Book[] {book1, book2, book3}
//        );
//
//        System.out.println("Library Name: " + library.getLibraryName());
//        System.out.println("Books in Library:");
//        for (Book book : library.getBooks()) {
//            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
//        }
//
//        System.out.println("Employees in Library:");
//        for (LibraryEmployee employee : library.getEmployees()) {
//            System.out.println("- " + employee.getFirstName() + " " + employee.getLastName() + " (ID: " + employee.getId() + ")");
//        }

    //6
//    public static void main(String[] args) {
//
//        Book book1 = new ScienceBook("Physics Fundamentals", 300, "John Doe", true, "Physics");
//        Book book2 = new FantasyBook("Greek Myths", 250, "Jane Smith", false, "Greece");
//        Book book3 = new AdventureBook("Jungle Adventures", 200, "Mark Twain", true);
//
//        LibraryEmployee employee1 = new Bookkeeper("Alice", "Brown", 1);
//        LibraryEmployee employee2 = new BookIssuer("Bob", "White", 2, "9:00 AM", "5:00 PM");
//        LibraryEmployee employee3 = new SilenceController("Charlie", "Green", 3, 8.5);
//        LibraryEmployee employee4 = new BookAdvisor("Diana", "Black", 4, 4.7, "City Library", Arrays.asList(book1, book2, book3));
//
//        Library library = new Library(
//                "City Library",
//                new LibraryEmployee[]{employee1, employee2, employee3, employee4},
//                new Book[]{book1, book2, book3}
//        );
//
//        System.out.println("Library Name: " + library.getLibraryName());
//        System.out.println("Books in Library:");
//        for (Book book : library.getBooks()) {
//            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
//        }
//
//        System.out.println("Employees in Library:");
//        for (LibraryEmployee employee : library.getEmployees()) {
//            System.out.println("- " + employee.getFirstName() + " " + employee.getLastName() + " (ID: " + employee.getId() + ")");
//        }
//
//        if (employee4 instanceof BookAdvisor) {
//            BookAdvisor bookAdvisor = (BookAdvisor) employee4;
//            Book recommendedBook = bookAdvisor.recommendBook();
//            System.out.println("Book Advisor " + bookAdvisor.getFirstName() + " recommends: ");
//            System.out.println("- " + recommendedBook.getTitle() + " by " + recommendedBook.getAuthor());
//        }
//    }
}
