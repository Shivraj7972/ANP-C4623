package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.StudentDetails;
import com.example.repos.StudentDetailsRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentDetailsService 
{
	private final StudentDetailsRepository studentdetailsrepository;
	
	public StudentDetails save(StudentDetails studentdetails)
	{
		return studentdetailsrepository.save(studentdetails);
	}
	
	public List<StudentDetails> getAllStudentDetails()
	{
		return studentdetailsrepository.findAll();
	}
	
	public StudentDetails getStudentDetailsById(Long id)
	{
		return studentdetailsrepository.findById(id).orElseThrow(()
		->new RuntimeException("StudentDetails not found with id " +id));
	}
	
	public void deleteStudentDetails(Long id)
	{
		StudentDetails existingstudentdetails = studentdetailsrepository.findById(id).get();
		studentdetailsrepository.delete(existingstudentdetails);
	}
	
	public StudentDetails updateStudentDetails(StudentDetails studentdetails, Long id)
	{
		StudentDetails existingstudentdetails = studentdetailsrepository.findById(id).get();
		existingstudentdetails.setCity(studentdetails.getCity());
		existingstudentdetails.setQualification(studentdetails.getQualification());
		return studentdetailsrepository.save(existingstudentdetails);
	}

}
