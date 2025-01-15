public class Main {
    public static void main(String[] args) {

        Elf elf = new Elf("Buddy", "Happy Elf", 120, 5, "Toy Maker");
        elf.makeToy();
        elf.wrapGifts();
        System.out.println(elf);

        Reindeer reindeer = new Reindeer("Dasher", "Speedy", 8, 60, "Red");
        reindeer.fly();
        reindeer.trainForChristmas();
        System.out.println("Fitness Level: " + reindeer.checkFitnessLevel());

        Child child = new Child("Timmy", 8);
        child.addWish("Lego Set");
        child.addWish("Bicycle");
        System.out.println(child);

        Santa santa = new Santa("Santa Claus", "Jolly", 1750);
        santa.addChild(child);
        santa.deliverGifts();

        Snowman snowman = new Snowman(5.0, "Red");
        snowman.decorate("Scarf");
    }
}