class RegularPolygon {
    protected int numberOfSides;
    protected double sideLength;

    public RegularPolygon(int numberOfSides, double sideLength) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }
     public double calculatePerimeter() {
        return numberOfSides * sideLength;
    }
}

