package com.example.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.sample.entity.Student;
import com.example.sample.respository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studRepository;
	
	public List<Student> getAllStudents()
	{
		return studRepository.findAll();
			
	}
	
	 public  Student saveStudent(Student s )
	  {
		  return studRepository.save(s);
	  }
	 public Student updateStudent(Student r)
	 {
	      return studRepository.save(r);
	 }
	 public void deleteStudent(int id)
	 {
		 studRepository.deleteById(id);
	 }
	 
	 public Optional<Student> findByIdStudent(int id)
	 {
		  return studRepository.findById(id);
	 }
	 
	

}

