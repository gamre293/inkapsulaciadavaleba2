class Milk extends Product {
    private double volume;

    public Milk(double price, String expiration, double volume) {
        super(price, expiration);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}