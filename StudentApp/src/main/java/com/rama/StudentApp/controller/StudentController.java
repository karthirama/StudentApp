package com.rama.StudentApp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rama.StudentApp.model.Student;
import com.rama.StudentApp.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	private final StudentService studentService;

	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students= studentService.getAllStudents();
		return new ResponseEntity<>(students,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id){
		Student student= studentService.getStudentById(id);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student newStudent= studentService.addStudent(student);
		return new ResponseEntity<>(newStudent,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		Student newStudent= studentService.updateStudent(student);
		return new ResponseEntity<>(newStudent,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Student> deleteStudentById(@PathVariable Long id){
		Student student= studentService.deleteStudentById(id);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}

}
