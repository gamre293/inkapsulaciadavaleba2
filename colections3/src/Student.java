import java.util.*;
import java.text.*;

class Student {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private ArrayList<Double> grades;

    public Student(String firstName, String lastName, String dob, ArrayList<Double> grades) throws ParseException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getGPA() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return firstName + " " + lastName + ", DOB: " + sdf.format(dateOfBirth) + ", GPA: " + String.format("%.2f", getGPA());
    }
}