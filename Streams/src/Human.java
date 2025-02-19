public class Human {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
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
        Human person1 = new Human("John", "Doe", 25);
        Human person2 = new Human("Jane", "Smith", 23);

        person1.walk();
        person1.hangOut(person2);
    }
}
