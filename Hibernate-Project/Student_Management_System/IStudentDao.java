package com.studentMgmtSystem.dao;

import java.util.List;
import java.util.Optional;

import com.studentMgmtSystem.model.Student;

public interface IStudentDao 
{
    void saveStudent(Student student);
    Optional<Student> getStudentById(Long id);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
