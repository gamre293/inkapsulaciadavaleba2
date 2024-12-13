class ScienceBook extends Book {
    private String fieldOfScience;

    public ScienceBook(String title, int numberOfPages, String author, boolean isHardcover, String fieldOfScience) {
        super(title, numberOfPages, author, isHardcover);
        this.fieldOfScience = fieldOfScience;
    }

    public String getFieldOfScience() {
        return fieldOfScience;
    }
}