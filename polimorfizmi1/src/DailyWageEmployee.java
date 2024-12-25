class DailyWageEmployee extends Employee {
    private int daysWorked;
    private double dailySalary;

    public DailyWageEmployee(String firstName, String lastName, String phoneNumber, int daysWorked, double dailySalary) {
        super(firstName, lastName, phoneNumber);
        this.daysWorked = daysWorked;
        this.dailySalary = dailySalary;
    }

    public double getSalary() {
        return daysWorked * dailySalary;
    }

    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("Salary: " + getSalary());
    }
}

