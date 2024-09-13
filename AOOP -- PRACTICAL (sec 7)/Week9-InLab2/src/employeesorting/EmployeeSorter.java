package employeesorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Raghu", "Engineering", 75000));
        employees.add(new Employee(102, "Sreya", "Marketing", 68000));
        employees.add(new Employee(103, "Shiva", "Finance", 80000));
        employees.add(new Employee(104, "Sai", "Engineering", 60000));
        employees.add(new Employee(105, "Shashank", "Finance", 82000));
        employees.add(new Employee(105, "Deekshita", "Marketing", 65000));
        

        System.out.println("Employees sorted by salary (ascending):");
        Collections.sort(employees, EmployeeComparators.bySalaryAsc);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nEmployees sorted by salary (descending):");
        Collections.sort(employees, EmployeeComparators.bySalaryDesc);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nEmployees sorted by name (alphabetical):");
        Collections.sort(employees, EmployeeComparators.byName);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nEmployees sorted by department (alphabetical):");
        Collections.sort(employees, EmployeeComparators.byDepartment);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
