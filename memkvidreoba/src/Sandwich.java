class Sandwich extends Product {
    private double length;

    public Sandwich(double price, String expiration, double length) {
        super(price, expiration);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}