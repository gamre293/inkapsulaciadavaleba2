public class Monitor {
    private double diagonalSize;
    private String resolution;
    private int refreshRate;

    public Monitor(double diagonalSize, String resolution, int refreshRate) {
        this.diagonalSize = diagonalSize;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }

    public void printMonitorInfo() {
        System.out.println("Monitor Information:");
        System.out.println("Diagonal Size: " + diagonalSize + " inches");
        System.out.println("Resolution: " + resolution);
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
    }
}