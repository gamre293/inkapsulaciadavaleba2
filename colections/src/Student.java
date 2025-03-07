import java.util.*;

class Student implements Comparable<Student> {
    private String id;
    private String firstName;
    String lastName;
    private Map<String, ArrayList<Integer>> scores;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = new HashMap<>();
    }

    public void addScore(String subject, int score) {
        scores.putIfAbsent(subject, new ArrayList<>());
        scores.get(subject).add(score);
    }

    public double getAverageScore() {
        int totalScore = 0;
        int count = 0;
        for (List<Integer> scoreList : scores.values()) {
            for (int score : scoreList) {
                totalScore += score;
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalScore / count;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.getAverageScore(), o.getAverageScore());
    }

    @Override
    public String toString() {
        return "Student{" + "id='" + id + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", averageScore=" + getAverageScore() + '}';
    }
}
