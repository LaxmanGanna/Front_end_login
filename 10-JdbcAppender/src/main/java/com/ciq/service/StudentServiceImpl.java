package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Student;
import com.ciq.repo.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class StudentServiceImpl implements StudentService{

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student insert(Student s) {
		LOGGER.info("--inside insert Student service method---");
		return studentRepository.save(s);
	}

	@Override
	public Student getStudentById(long id) {
		 LOGGER.info("--inside getStudentById service method---");
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		LOGGER.info("--inside getAllStudent service method---");
		return studentRepository.findAll();
	}

}
