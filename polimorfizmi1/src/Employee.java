abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;

    public Employee(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public abstract double getSalary();

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
    }
}