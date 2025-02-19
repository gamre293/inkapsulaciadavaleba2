import java.util.Scanner;

public class Humam {
    private String firstName;
    private String lastName;
    private int age;

    public Humam(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void walk() {
        System.out.println(firstName + " walks");
    }

    public void hangOut(Human friend) {
        System.out.println(firstName + " is hanging out with " + friend.getFirstName());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.next();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        Human person = new Human(firstName, lastName, age);

        person.walk();

        Human friend = new Human("Alice", "Brown", 24);
        person.hangOut(friend);

        scanner.close();
    }
}
