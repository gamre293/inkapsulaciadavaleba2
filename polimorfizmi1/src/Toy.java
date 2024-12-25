abstract class Toy {
    protected double otherExpenses;

    public Toy(double otherExpenses) {
        this.otherExpenses = otherExpenses;
    }

    public abstract double calculatePrice();
}