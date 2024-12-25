class Triangle extends Shape {
    private double z;

    public Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void printData() {
        System.out.println("Triangle with sides: x = " + x + ", y = " + y + ", z = " + z);
    }

    public double calculatePerimeter() {
        return x + y + z;
    }
}
