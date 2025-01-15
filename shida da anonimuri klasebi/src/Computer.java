class Computer {
    private String countryOfManufacture;
    private String brand;
    private double price;
    private boolean hasWarranty;

    public Computer(String countryOfManufacture, String brand, double price, boolean hasWarranty) {
        this.countryOfManufacture = countryOfManufacture;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
    }
}