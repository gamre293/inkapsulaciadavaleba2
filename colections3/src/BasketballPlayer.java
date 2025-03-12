class BasketballPlayer {
    private String firstName;
    private String lastName;
    private int shots;
    private int rebounds;
    private int blocks;
    private int goodPasses;
    private int lostBalls;

    public BasketballPlayer(String firstName, String lastName, int shots, int rebounds, int blocks, int goodPasses, int lostBalls) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.shots = shots;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.goodPasses = goodPasses;
        this.lostBalls = lostBalls;
    }

    public double calculateRating() {
        return (shots * 1.0) + (rebounds * 1.0) + (blocks * 2.0) + (goodPasses * 1.5) + (lostBalls * -2.0);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - Rating: " + calculateRating();
    }
}