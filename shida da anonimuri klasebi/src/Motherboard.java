public class Motherboard {
    private int ramSlots;
    private String ramType;
    private double frequency;

    public Motherboard(int ramSlots, String ramType, double frequency) {
        this.ramSlots = ramSlots;
        this.ramType = ramType;
        this.frequency = frequency;
    }

    public void printMotherboardInfo() {
        System.out.println("Motherboard Information:");
        System.out.println("Number of RAM Slots: " + ramSlots);
        System.out.println("RAM Type: " + ramType);
        System.out.println("Frequency: " + frequency + " MHz");
    }
    public void printComputerInfo() {
        System.out.println("Computer Information:");
        System.out.println("Country of Manufacture: " + countryOfManufacture);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Has Warranty: " + (hasWarranty ? "Yes" : "No"));
    }
}

