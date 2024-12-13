class FantasyBook extends Book {
    private String countryOfMythologicalCharacters;

    public FantasyBook(String title, int numberOfPages, String author, boolean isHardcover, String countryOfMythologicalCharacters) {
        super(title, numberOfPages, author, isHardcover);
        this.countryOfMythologicalCharacters = countryOfMythologicalCharacters;
    }

    public String getCountryOfMythologicalCharacters() {
        return countryOfMythologicalCharacters;
    }
}
