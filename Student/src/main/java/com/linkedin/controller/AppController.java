package com.linkedin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkedin.model.Student;
import com.linkedin.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class AppController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public ResponseEntity<Student> save(@RequestBody Student student){
		
		Student savedStudent = studentService.save(student);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
	}
}
