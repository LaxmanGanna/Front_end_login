package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Student;
import com.ciq.service.StudentService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class StudentController {

	 private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
	 
	 @Autowired
	 private StudentService studentService;
	 
	 @GetMapping(path="/getMovies",produces="application/json")
		public List<Student> getAllStudents(){
			LOGGER.info("**********getMovies action called..");

			List<Student> allStudents = studentService.getAllStudents();
			return allStudents;
			
		}
	 
}
