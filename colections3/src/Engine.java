class Engine {
    private String fuelType;
    private int cylinders;
    private double displacement;

    public Engine(String fuelType, int cylinders, double displacement) {
        this.fuelType = fuelType;
        this.cylinders = cylinders;
        this.displacement = displacement;
    }

    public double getDisplacement() {
        return displacement;
    }

    @Override
    public String toString() {
        return fuelType + ", " + cylinders + " cylinders, " + displacement + "L";
    }
}

