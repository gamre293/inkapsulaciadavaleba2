class Book {
    private int bookId;
    private String bookName;

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public void printBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
    }
}
