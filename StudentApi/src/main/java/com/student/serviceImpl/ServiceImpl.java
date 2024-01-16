package com.student.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.StudentDetails;
import com.student.repo.StudentRepo;
import com.student.service.StudentService;


@Service
public class ServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo repo;

	// save single student data
	@Override
	public StudentDetails save(StudentDetails studentDetails) {
	
		return repo.save(studentDetails);
	}

	//save multiple student data
	@Override
	public List<StudentDetails> saveall(List<StudentDetails> studentDetails) {
	
		return repo.saveAll(studentDetails);
	}

	// find student by his id number
	public Optional<StudentDetails> getId(long id) {
		
		return repo.findById(id);
	}
	
	//get all student data
	@Override
	public List<StudentDetails> getAll() {
		
		return repo.findAll();
	}

	//Find student with his city name
	public StudentDetails getCity(String name) {
		return repo.findBystudentCity(name);
	}
	
	//find studet by his salary
	public List<StudentDetails> salary() {
		
		return repo.getSalary();
	}
	
	// update student  details
	public StudentDetails update(StudentDetails studen) {
		
		StudentDetails exist = repo.findById(studen.getId()).orElse(null);
		exist.setStudentName(studen.getStudentName());
		exist.setStudentCity(studen.getStudentCity());
		exist.setStudentAge(studen.getStudentAge());
		exist.setStudentFee(studen.getStudentFee());
		return repo.save(exist);
	}
	
	
	
	@Override
	public String deleteId(long id) {
		
		repo.deleteById(id);
		return "your data has been successfully deleted: "+id;
	}
	
	
	
	

}
