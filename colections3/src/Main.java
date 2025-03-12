import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ArrayList<BasketballPlayer> players = new ArrayList<>();
        //1
        players.add(new BasketballPlayer("Michael", "Jordan", 10, 5, 2, 4, 3));
        players.add(new BasketballPlayer("LeBron", "James", 8, 7, 1, 6, 2));
        players.add(new BasketballPlayer("Kobe", "Bryant", 12, 4, 3, 5, 4));
        players.add(new BasketballPlayer("Shaquille", "O'Neal", 15, 10, 5, 2, 6));
        players.add(new BasketballPlayer("Stephen", "Curry", 9, 3, 0, 8, 1));

        players.sort(Comparator.comparingDouble(BasketballPlayer::calculateRating).reversed());
        System.out.println("Players sorted by descending rating:");
        for (BasketballPlayer player : players) {
            System.out.println(player);
        }

        players.sort(Comparator.comparingDouble(BasketballPlayer::calculateRating));
        System.out.println("\nPlayers sorted by ascending rating:");
        for (BasketballPlayer player : players) {
            System.out.println(player);
        }

        //2
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Johnson", "2002-05-14", new ArrayList<>(Arrays.asList(3.5, 4.0, 3.7))));
        students.add(new Student("Bob", "Smith", "2001-08-22", new ArrayList<>(Arrays.asList(3.2, 3.8, 3.6))));
        students.add(new Student("Charlie", "Brown", "2003-01-10", new ArrayList<>(Arrays.asList(4.0, 4.0, 3.9))));

        System.out.println("Unsorted:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName));
        System.out.println("\nSorted lexically:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparingDouble(Student::getGPA).reversed());
        System.out.println("\nSorted by GPA:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparing(Student::getDateOfBirth));
        System.out.println("\nSorted by Date of Birth:");
        students.forEach(System.out::println);

        //3
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2018, 50000, new Engine("Gasoline", 4, 1.8)));
        cars.add(new Car("Honda", "Civic", 2020, 30000, new Engine("Gasoline", 4, 2.0)));
        cars.add(new Car("Ford", "Focus", 2016, 70000, new Engine("Gasoline", 4, 1.5)));

        System.out.println("Unsorted:");
        cars.forEach(System.out::println);

        cars.sort(Comparator.comparing(Car::getYear));
        System.out.println("\nSorted by Year of Manufacture:");
        cars.forEach(System.out::println);

        cars.sort(Comparator.comparing(Car::getMileage));
        System.out.println("\nSorted by Mileage:");
        cars.forEach(System.out::println);

        cars.sort(Comparator.comparing(Car::getEngineDisplacement));
        System.out.println("\nSorted by Engine Displacement:");
        cars.forEach(System.out::println);
    }
}

    }
}


