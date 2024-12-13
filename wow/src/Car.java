class Car extends MotorVehicle {
    private int numDoors;

    public Car(String name, int numDoors) {
        super(name);
        this.numDoors = numDoors;
    }

    public String describe() {
        return super.describe() + ", Number of Doors: " + numDoors;
    }

    public String honkHorn() {
        return "Car Horn!";
    }
}