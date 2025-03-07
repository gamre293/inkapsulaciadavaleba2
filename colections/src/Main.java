import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Count: " + wordCount);

        Student student1 = new Student("101", "John", "Doe");
        student1.addScore("Mathematics", 90);
        student1.addScore("Mathematics", 85);
        student1.addScore("Georgian", 78);
        student1.addScore("Georgian", 88);

        Student student2 = new Student("102", "Alice", "Smith");
        student2.addScore("Mathematics", 95);
        student2.addScore("Mathematics", 92);
        student2.addScore("Georgian", 85);
        student2.addScore("Georgian", 90);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("Comparison by average grade: " + student1.compareTo(student2));

        StudentLastNameComparator lastNameComparator = new StudentLastNameComparator();
        System.out.println("Comparison by last name: " + lastNameComparator.compare(student1, student2));

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        students.sort(Collections.reverseOrder());
        System.out.println("Sorted by average score: " + students);

        students.sort(new StudentLastNameComparator());
        System.out.println("Sorted by last name: " + students);
    }
}
