package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.StudentDetails;
import com.student.serviceImpl.ServiceImpl;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {
	
	@Autowired
	private ServiceImpl serviceImpl;
	
//	Create Data
	@PostMapping("/saveProduct")
	public StudentDetails saveStudent(@RequestBody StudentDetails studentDetails) {
		
		return serviceImpl.save(studentDetails);
	}
	
	@PostMapping("/saveAll")
	public List<StudentDetails> saveAllStudent(@RequestBody List<StudentDetails> studentDetails){
		
		return serviceImpl.saveall(studentDetails);
	}
	
	
	@GetMapping("/student/{id}")
	public Optional<StudentDetails> getById(@PathVariable("id") long id) {
		
		return serviceImpl.getId(id);
	}
	
	
	@GetMapping("/getAllStudent")
	public List<StudentDetails> getAllStudent(){
		
		return serviceImpl.getAll();
	}
	
	
	@GetMapping("/cityname/{city}")
	public StudentDetails getCityBy(@PathVariable("city") String city) {
		return serviceImpl.getCity(city);
	}
	
	@GetMapping("/salary")
	public List<StudentDetails> getmysalry(){
          return serviceImpl.salary();
	}
		
	//Update the data
	@PutMapping("/update")
	public StudentDetails updateStudent(@RequestBody StudentDetails studentDetails) {
		
		return serviceImpl.update(studentDetails);
	}
	
	//Delete the data
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") long id) {
		
	   return serviceImpl.deleteId(id);
	}
	
	

}
