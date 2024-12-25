class Dolly extends Toy {
    private double hairMaterialCost;
    private double clothesCost;

    public Dolly(double hairMaterialCost, double clothesCost, double otherExpenses) {
        super(otherExpenses);
        this.hairMaterialCost = hairMaterialCost;
        this.clothesCost = clothesCost;
    }

    public double calculatePrice() {
        return hairMaterialCost + clothesCost + otherExpenses;
    }
}