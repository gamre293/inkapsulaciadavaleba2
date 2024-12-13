public class Vehicle {
    private String name;
    protected float speed;

    public Vehicle(String name) {
        this.name = name;
    }

    public float move(float distance) {
        return distance / speed;
    }

    public String getName() {
        return name;
    }

    public String describe() {
        return "Vehicle: " + name + ", Speed: " + speed;
    }
}
