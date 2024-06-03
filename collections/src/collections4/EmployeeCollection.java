package collections4;

import java.util.TreeSet;

public class EmployeeCollection {
    private TreeSet<Employee> employees;

    public EmployeeCollection() {
        employees = new TreeSet<Employee>((e1, e2) -> e1.getEmpid() - e2.getEmpid());
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortByName() {
        TreeSet<Employee> sortedEmployees = new TreeSet<Employee>((e1, e2) -> e1.getFirstname().compareTo(e2.getFirstname()));
        sortedEmployees.addAll(employees);
        employees = sortedEmployees;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}