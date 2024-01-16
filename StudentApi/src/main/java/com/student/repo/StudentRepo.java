package com.student.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.model.StudentDetails;

@Repository
public interface StudentRepo extends JpaRepository<StudentDetails, Long> {

	public StudentDetails findBystudentCity(String name);
	
	
	@Query(value = "select * from student_api order by student_fee desc limit 1,1", nativeQuery = true)
	public List<StudentDetails> getSalary();
	
	
}
