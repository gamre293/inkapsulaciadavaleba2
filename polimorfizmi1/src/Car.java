class Car extends Toy {
    private double salonCost;
    private double wheelCost;
    private int numberOfWheels;

    public Car(double salonCost, double wheelCost, int numberOfWheels, double otherExpenses) {
        super(otherExpenses);
        this.salonCost = salonCost;
        this.wheelCost = wheelCost;
        this.numberOfWheels = numberOfWheels;
    }

    public double calculatePrice() {
        return salonCost + (wheelCost * numberOfWheels) + otherExpenses;
    }
}
