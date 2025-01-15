public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String personalNumber;
    private double averageScore;
    private int course;

    public Student(String firstName, String lastName, int age, String personalNumber, double averageScore, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalNumber = personalNumber;
        this.averageScore = averageScore;
        this.course = course;
    }

    public void printStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Personal Number: " + personalNumber);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Course: " + course);
    }
}
