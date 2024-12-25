class FixedSalaryEmployee extends Employee {
    private double salary;

    public FixedSalaryEmployee(String firstName, String lastName, String phoneNumber, double salary) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("Salary: " + salary);
    }
}

