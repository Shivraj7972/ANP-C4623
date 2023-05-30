package com.example.employeemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employees")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(name = "FirstName")
	 private String fname;
	 
	 @Column(name = "LastName")
	 private String lname;
	 
	 @ManyToOne
	 @JoinColumn(name = "department_id")
	 private Department department;
	 
}
