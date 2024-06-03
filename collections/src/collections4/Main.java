package collections4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeCollection employeeCollection = new EmployeeCollection();
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter empid, firstname, and lastname (or 'STOP' to exit):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("STOP")) {
                break;
            }
            String[] parts = input.split(",");
            int empid = Integer.parseInt(parts[0].trim());
            String firstname = parts[1].trim();
            String lastname = parts[2].trim();
            Employee employee = new Employee(empid, firstname, lastname);
            employeeCollection.addEmployee(employee);
        }

        System.out.println("Employees:");
        employeeCollection.printEmployees();

        System.out.println("Sorting by name...");
        employeeCollection.sortByName();
        System.out.println("Employees (sorted by first name):");
        employeeCollection.printEmployees();
    }
}


//// Sample input : 1, Dikshya,Das OR 1, Dikshya,Das (space after comma does not effect the input)