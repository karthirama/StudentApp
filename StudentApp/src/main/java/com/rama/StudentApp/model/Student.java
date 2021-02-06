package com.rama.StudentApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable = false , updatable = false)
	private long id;

	private String name;
	
	private String age;
	
	private String college;

	private String degree;
	
	private String department;

	public Student() {
		
	}
	
	public Student(long id, String name, String age, String college, String degree, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.college = college;
		this.degree = degree;
		this.department = department;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", college=" + college + ", degree=" + degree
				+ ", department=" + department + "]";
	}
	
	
}
