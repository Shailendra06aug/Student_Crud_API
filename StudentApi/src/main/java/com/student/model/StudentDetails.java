package com.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// This is my Model class
@Entity
@Table(name = "studentApi")
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private long id;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_city")
	private String studentCity;
	
	@Column(name = "student_age")
	private String studentAge;
	
	@Column(name = "student_fee")
	private long studentFee;
	
	
	
	
	public StudentDetails() {
		super();
		
	}

	public StudentDetails(long id, String studentName, String studentCity, String studentAge, long studentFee) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentAge = studentAge;
		this.studentFee = studentFee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}




	public String getStudentName() {
		return studentName;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public String getStudentCity() {
		return studentCity;
	}




	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}




	public String getStudentAge() {
		return studentAge;
	}




	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}




	public long getStudentFee() {
		return studentFee;
	}




	public void setStudentFee(long studentFee) {
		this.studentFee = studentFee;
	}




	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentAge=" + studentAge + ", studentFee=" + studentFee + "]";
	}
	
	

}
