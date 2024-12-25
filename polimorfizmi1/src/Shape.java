class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printData() {
        System.out.println("Shape with dimensions: x = " + x + ", y = " + y);
    }

    public double calculatePerimeter() {
        return 0;
    }
}


