class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private Engine engine;

    public Car(String make, String model, int year, int mileage, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getEngineDisplacement() {
        return engine.getDisplacement();
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + ", Mileage: " + mileage + " km, Engine: " + engine;
    }
}