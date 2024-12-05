public class Main {
    public static void main(String[] args) {
        Book book = new Book("Advanture of David", 395);
        book.printInfo();
        book.addPages(54);
        book.printInfo();
    }
}