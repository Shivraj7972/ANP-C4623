package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repos.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService 
{
	private final StudentRepository studentrepository;
	public Student save(Student student)
	{
		return studentrepository.save(student);
	}
	
	public List<Student> getAllStudent()
	{
		return studentrepository.findAll();
	}
	
	public Student getStudentById(Long id) 
	{
	    return studentrepository.findById(id).orElseThrow(() 
	    -> new RuntimeException("Student not found with id: " + id));
	}
	
	public void deletestudent(Long id)
	{
		Student existingStudent = studentrepository.findById(id).get();
		studentrepository.delete(existingStudent);
	}
	
	public Student updateStudent(Student student, Long id)
	{
		Student existingStudent = studentrepository.findById(id).get();
		existingStudent.setFname(student.getFname());
		existingStudent.setLname(student.getLname());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setContactNo(student.getContactNo());
		return studentrepository.save(existingStudent);
	}



}
