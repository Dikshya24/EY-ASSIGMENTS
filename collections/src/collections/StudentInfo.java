package collections;

import java.util.HashSet;

public class StudentInfo {
    private HashSet<Student> students;

    public StudentInfo() {
        students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName() + ", Age: " + student.getAge() + ", Address: " + student.getAddress().getStreet() + ", " + student.getAddress().getCity() + ", " + student.getAddress().getState() + " " + student.getAddress().getZip());
        }
    }
}