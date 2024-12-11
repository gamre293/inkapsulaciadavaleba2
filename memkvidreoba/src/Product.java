public class Product {
    private double price;
    private String expiration;

    public Product(double price, String expiration) {
        this.price = price;
        this.expiration = expiration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}
