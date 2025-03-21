import java.util.Arrays;
import java.util.List;

public class HumanFilter {
    public static void main(String[] args) {
        List<Human> people = Arrays.asList(
                new Human("Levani", 20),
                new Human("Anna", 14),
                new Human("Giorgi", 18),
                new Human("Nino", 10),
                new Human("Levani", 25)
        );

        List<Human> filteredPeople = people.stream()
                .filter(person -> person.getAge() >= 15)
                .toList();

        boolean hasLevani = filteredPeople.stream()
                .anyMatch(person -> person.getName().equals("Levani"));

        System.out.println("Filtered people (age >= 15):");
        filteredPeople.forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));

        System.out.println("Is there at least one person named Levani? " + hasLevani);
    }
}
