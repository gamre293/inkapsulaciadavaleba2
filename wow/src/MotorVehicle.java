class MotorVehicle extends Vehicle {
    protected int numberOfWheels;
    protected float engineVolume;

    public MotorVehicle(String name) {
        super(name);
    }

    public String honkHorn() {
        return "Honk! Honk!";
    }
}
