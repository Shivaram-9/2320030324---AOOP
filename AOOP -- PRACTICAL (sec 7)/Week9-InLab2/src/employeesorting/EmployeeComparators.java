package employeesorting;

import java.util.Comparator;

public class EmployeeComparators {

    public static Comparator<Employee> bySalaryAsc = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };

    public static Comparator<Employee> bySalaryDesc = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e2.getSalary(), e1.getSalary());
        }
    };

    public static Comparator<Employee> byName = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareToIgnoreCase(e2.getName());
        }
    };

    public static Comparator<Employee> byDepartment = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
        }
    };
}
