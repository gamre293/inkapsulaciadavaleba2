class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private boolean isHardcover;

    public Book(String title, int numberOfPages, String author, boolean isHardcover) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    public void read() {
        System.out.println("I am reading book " + title);
    }
}