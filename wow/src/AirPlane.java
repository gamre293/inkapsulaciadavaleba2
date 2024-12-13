class Airplane extends Vehicle {
    private float wingspan;
    private int capacity;
    private boolean landingGear;

    public Airplane(String name, float wingspan, int capacity) {
        super(name);
        this.wingspan = wingspan;
        this.capacity = capacity;
    }

    public void setLandingGear(boolean set) {
        this.landingGear = set;
    }

    public float move(float distance) {
        return distance / speed;
    }

    public String describe() {
        return super.describe() + ", Wingspan: " + wingspan + ", Capacity: " + capacity;
    }
}
