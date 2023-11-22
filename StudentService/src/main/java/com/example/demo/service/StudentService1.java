package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student1;
import com.example.demo.repository.StudentRepository1;

@Service
public class StudentService1 {

	@Autowired
	private StudentRepository1 studentRepository;
	
	
	public String addStudent(Student1 student) {
		if(studentRepository.save(student)!=null)
			return "Registration was successfull";
		else
			return "Something went wrong";
		
	}
	public String removeStudentByid(int id) {
		studentRepository.deleteById(id);
		return "deleted Successfilly";
	}
}
