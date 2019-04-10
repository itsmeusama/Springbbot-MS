package com.example.demo.service;

import com.example.demo.model.Student;

public interface StudentService {
	
	Student save(Student student);
	Student fetch();
	Student fetch(Student student);

}
