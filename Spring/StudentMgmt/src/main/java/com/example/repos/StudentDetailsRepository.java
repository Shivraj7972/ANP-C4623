package com.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentDetails;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Long> 
{

}
