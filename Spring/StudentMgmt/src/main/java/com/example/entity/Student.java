package com.example.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.*;

@Entity
@Table(name ="Student_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "First_Name")
	private String fname;
	
	@NotNull
	@Column(name = "Last_Name")
	private String lname;
	
	@NotNull
	@Column(name = "Email")
	private String email;
	
	@NotNull
	@Column(name = "Contact_No")
	private String contactNo;

	@OneToOne(mappedBy = "Student", cascade =CascadeType.ALL)
	private StudentDetails studentDetails;
}
