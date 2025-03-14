import java.io.*;
import java.util.*;
import java.nio.file.*;

public class StudentManager {

    public static void main(String[] args) {
        String inputFilePath = "students.txt";
        String serializedFilePath = "students.ser";

        List<Student> studentList = readStudentsFromFile(inputFilePath);

        if (studentList != null) {
            serializeStudents(studentList, serializedFilePath);

            List<Student> deserializedStudents = deserializeStudents(serializedFilePath);

            for (Student student : deserializedStudents) {
                System.out.println(student);
            }
        }
    }

    private static List<Student> readStudentsFromFile(String filePath) {
        List<Student> students = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] parts = line.split(",");
                if (parts.length < 6) continue;

                int id = Integer.parseInt(parts[0].trim());
                String firstName = parts[1].trim();
                String lastName = parts[2].trim();
                int year = Integer.parseInt(parts[3].trim());
                double gradePoint = Double.parseDouble(parts[4].trim());

                List<String> subjects = Arrays.asList(parts[5].trim().split(" "));

                Student student = new Student(id, firstName, lastName, year, gradePoint, subjects);
                students.add(student);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
            return null;
        }
        return students;
    }

    private static void serializeStudents(List<Student> students, String filePath) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(students);
            System.out.println("Students serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    private static List<Student> deserializeStudents(String filePath) {
        List<Student> students = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            students = (List<Student>) in.readObject();
            System.out.println("Students deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
        return students;
    }
}
