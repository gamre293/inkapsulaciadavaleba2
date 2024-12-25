class Car2 implements StartStop, LeftRight {

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void left() {
        System.out.println("Car turned left");
    }

    public void right() {
        System.out.println("Car turned right");
    }
}