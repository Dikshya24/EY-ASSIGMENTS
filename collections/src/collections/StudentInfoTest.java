package collections;

import java.util.Scanner;


public class StudentInfoTest {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter student information (format: FirstName LastName Age Address) or type 'STOP' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("STOP")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length!= 4) {
                System.out.println("Invalid input format. Please try again.");
                continue;
            }

            String firstName = parts[0];
            String lastName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String address = parts[3];

            Address addressObj = new Address(address, "", "", "");
            Student student = new Student(firstName, lastName, age, addressObj);
            studentInfo.addStudent(student);
        }

        System.out.println("Student Information:");
        studentInfo.printStudents();
        scanner.close();
    }
}