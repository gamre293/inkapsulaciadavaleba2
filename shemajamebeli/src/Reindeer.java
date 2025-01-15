class Reindeer extends WorkshopMember {
    private int flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickName, int age, int flyingSpeed, String noseColor) {
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public int getFlyingSpeed() { return flyingSpeed; }
    public void setFlyingSpeed(int flyingSpeed) { this.flyingSpeed = flyingSpeed; }

    public String getNoseColor() { return noseColor; }
    public void setNoseColor(String noseColor) { this.noseColor = noseColor; }

    public void fly() {
        System.out.println(getName() + " is flying at speed " + flyingSpeed + "!\n");
    }

    public void trainForChristmas() {
        System.out.println(getName() + " is training for Christmas!\n");
        flyingSpeed += 5;
    }

    public String checkFitnessLevel() {
        if (flyingSpeed > 50 && getAge() < 10) return "A";
        if (flyingSpeed > 40) return "B";
        return "C";
    }

    public String toString() {
        return super.toString() + ", Flying Speed: " + flyingSpeed + ", Nose Color: " + noseColor;
    }
}