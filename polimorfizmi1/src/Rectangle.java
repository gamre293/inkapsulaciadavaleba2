class Rectangle extends Shape {

    public Rectangle(double x, double y) {
        super(x, y); // A rectangle is defined by its width and height
    }

    public void printData() {
        System.out.println("Rectangle with dimensions: x = " + x + ", y = " + y);
    }

    public double calculatePerimeter() {
        return 2 * (x + y);
    }
}
