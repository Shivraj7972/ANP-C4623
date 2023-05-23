package com.example.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.entity.StudentDetails;
import com.example.services.StudentDetailsService;


@RestController
@RequestMapping("/studentdetails")
public class StudentDetailsController
{
	
	@Autowired
	private StudentDetailsService studentdetailsService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public StudentDetails create(@RequestBody StudentDetails studentdetail ) 
	{
		return studentdetailsService.save(studentdetail);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<StudentDetails> read() {
		return studentdetailsService.getAllStudentDetails();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public StudentDetails read(@PathVariable Long id) {
		return studentdetailsService.getStudentDetailsById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		studentdetailsService.deleteStudentDetails(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public StudentDetails update(@PathVariable Long id, @RequestBody StudentDetails studentdetail) {
		return studentdetailsService.updateStudentDetails(studentdetail, id);
	}
}
