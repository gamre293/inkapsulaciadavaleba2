import java.io.*;

class Country implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int population;
    private double area;

    public Country(String name, int population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Country{name='" + name + "', population=" + population + ", area=" + area + "}";
    }
}