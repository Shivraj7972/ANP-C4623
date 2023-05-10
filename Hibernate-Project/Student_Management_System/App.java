package com.studentMgmtSystem.main;

import com.studentMgmtSystem.dao.StudentDao;
import com.studentMgmtSystem.model.Student;

import java.util.List;

public class App {

    public static void main(String[] args) {
        // Create a StudentDao instance
        StudentDao dao = new StudentDao();

        // Create and save a new student
        Student student = new Student();
        student.setEmail("salunkeshivraj@gmail.com");
        student.setName("Shivraj");
        dao.saveStudent(student);
        System.out.println("New student added. Student ID: " + student.getId());

        // Retrieve all students
        List<Student> students = dao.getAllStudents();
        System.out.println("All students:");
        students.forEach(System.out::println);

        // Update a student's email
        Student firstStudent = students.get(0);
        firstStudent.setEmail("xyz@gmail.com");
        dao.updateStudent(firstStudent);
        System.out.println("Student updated: " + firstStudent);

        // Delete a student
        Student lastStudent = students.get(students.size() - 1);
        dao.deleteStudent(lastStudent);
        System.out.println("Student deleted. Student ID: " + lastStudent.getId());
    }
}
