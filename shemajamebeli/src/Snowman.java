import java.util.ArrayList;
import java.util.List;

class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(double height, String hatColor) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = false;
        this.accessories = new ArrayList<>();
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public String getHatColor() { return hatColor; }
    public void setHatColor(String hatColor) { this.hatColor = hatColor; }

    public boolean isMagical() { return isMagical; }

    public void makeMagical() {
        this.isMagical = true;
    }

    public void decorate(String accessory) {
        accessories.add(accessory);
        System.out.println("Added accessory: " + accessory);
    }

    public void melt() {
        if (height == 0) {
            System.out.println("Snowman has already melted completely.");
            return;
        }
        height = Math.max(0, height / 2);
        System.out.println("Snowman melted. Current height: " + height);
    }

    public String toString() {
        return "Snowman [Height: " + height + ", Hat Color: " + hatColor + ", Is Magical: " + isMagical + ", Accessories: " + accessories + "]";
    }
}