package com.rama.StudentApp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rama.StudentApp.model.Student;
import com.rama.StudentApp.repo.StudentRepository;

@Service
@Transactional
public class StudentService {
	
	private StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public Student getStudentById(Long id) {
		return studentRepository.findStudentById(id);
	}
	
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student deleteStudentById(Long id) {
		return studentRepository.deleteStudentById(id);
	}

}
