package com.example.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.*;

@Entity
@Table(name ="StudentDetail_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "City")
	private String city;
	
	@NotNull
	@Column(name = "Qualification")
	private String qualification;
	
}
