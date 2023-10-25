package com.linkedin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkedin.dao.StudentRepository;
import com.linkedin.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student save(Student theStudent) {
		
		Student savedStudent = studentRepository.save(theStudent);
		
		return savedStudent;
	}
}
