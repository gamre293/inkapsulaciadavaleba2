class Cake extends Product {
    private double weight;

    public Cake(double price, String expiration, double weight) {
        super(price, expiration);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}