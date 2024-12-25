class Square extends RegularPolygon {

    public Square(double sideLength) {
        super(4, sideLength);
    }

    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
