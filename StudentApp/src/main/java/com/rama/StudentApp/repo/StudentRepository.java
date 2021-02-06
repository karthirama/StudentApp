package com.rama.StudentApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rama.StudentApp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findStudentById(Long id);

	Student deleteStudentById(Long id);

}
