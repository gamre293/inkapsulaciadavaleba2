import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        List<Employee> employeeList = employeeFactory.getAllEmployee();

        List<Employee> sortedEmployees = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName)
                        .thenComparing(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println("Sorted Employees (by First Name, then Salary):");
        sortedEmployees.forEach(emp ->
                System.out.println(emp.getFirstName() + " " + emp.getLastName() + " - Salary: " + emp.getSalary())
        );
    }
}
