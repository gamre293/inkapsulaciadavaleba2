class Truck extends MotorVehicle {
    private float horsepower;

    public Truck(String name, float horsepower) {
        super(name);
        this.horsepower = horsepower;
    }

    public String describe() {
        return super.describe() + ", Horsepower: " + horsepower;
    }

    public String honkHorn() {
        return "Truck Horn!";
    }
}