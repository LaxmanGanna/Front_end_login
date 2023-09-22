package com.ciq.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ciq.entity.Student;

@Service
public interface StudentService {

	 public Student insert(Student s);
	    public Student getStudentById(long id);
	    public List<Student> getAllStudents();
}
