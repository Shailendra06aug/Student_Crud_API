package com.student.service;

import java.util.List;

import com.student.model.StudentDetails;

public interface StudentService {

	public StudentDetails save(StudentDetails studentDetails);
	
	public List<StudentDetails> saveall(List<StudentDetails> studentDetails);
	
	public List<StudentDetails>  getAll();
	
//	public StudentDetails update(StudentDetails studentDetails);
	
	public String deleteId(long id);
	
	
	
}
