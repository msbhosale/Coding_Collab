package com.linkedin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkedin.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
