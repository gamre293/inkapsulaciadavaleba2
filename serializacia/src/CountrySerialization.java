import java.io.*;
import java.util.*;

public class CountrySerialization {
    private static final String FILE_NAME = "countries.txt";

    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Enter details for country " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Population: ");
                int population = scanner.nextInt();
                System.out.print("Area: ");
                double area = scanner.nextDouble();
                scanner.nextLine();
                countries.add(new Country(name, population, area));
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter correct values.");
                scanner.nextLine();
                i--;
            }
        }
        scanner.close();

        serializeCountries(countries);
        deserializeCountries();
    }

    private static void serializeCountries(List<Country> countries) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(countries);
            System.out.println("Countries have been serialized to " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }

    private static void deserializeCountries() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<Country> countries = (List<Country>) ois.readObject();
            System.out.println("\nDeserialized Countries:");
            countries.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}
