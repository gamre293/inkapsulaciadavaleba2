import java.io.*;
import java.util.*;

class Student implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private double avgScore;
    private List<String> subjects;

    public Student(int id, String firstName, String lastName, int year, double avgScore, List<String> subjects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.avgScore = avgScore;
        this.subjects = new ArrayList<>(subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, avgScore);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return id == other.id && new HashSet<>(subjects).equals(new HashSet<>(other.subjects));
    }

    @Override
    public String toString() {
        return String.format("Student: {\n id: %d,\n firstName: %s,\n lastName: %s,\n year: %d,\n avgScore: %.1f,\n subjects: {\n %s\n}\n}",
                id, firstName, lastName, year, avgScore, String.join("\n ", subjects));
    }

    public double getAvgScore() {
        return avgScore;
    }

    public static Student fromLine(String line) {
        String[] data = line.split(",");
        int id = Integer.parseInt(data[0].trim());
        String firstName = data[1].trim();
        String lastName = data[2].trim();
        int year = Integer.parseInt(data[3].trim());
        double avgScore = Double.parseDouble(data[4].trim());
        List<String> subjects = Arrays.asList(data[5].trim().split(" "));
        return new Student(id, firstName, lastName, year, avgScore, subjects);
    }
}