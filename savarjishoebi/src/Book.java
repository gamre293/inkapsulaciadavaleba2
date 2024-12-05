public class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    void addPages(int number) {
        pages += number;
    }
    void printInfo() {
        System.out.println("book: {");
        System.out.println("\tTitle: " + title);
        System.out.println("\tPages: " + pages);
        System.out.println("}");
    }
}
