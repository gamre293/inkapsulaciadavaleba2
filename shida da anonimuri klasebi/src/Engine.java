public class Engine {
    private String fuelType;
    private int numberOfCylinders;
    private double mileage;

    public Engine(String fuelType, int numberOfCylinders, double mileage) {
        this.fuelType = fuelType;
        this.numberOfCylinders = numberOfCylinders;
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void printEngineInfo() {
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Cylinders: " + numberOfCylinders);
        System.out.println("Mileage: " + mileage);
    }

    public void printCarInfo(Engine engine) {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("License Plate: " + licensePlate);
        engine.printEngineInfo();
    }
}
