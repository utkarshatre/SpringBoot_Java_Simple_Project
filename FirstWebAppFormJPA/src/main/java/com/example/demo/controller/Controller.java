package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("homego")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("savetodb")
	public String savebyweb(Student student) {
		
		repo.save(student);
		return "home.jsp";
	}
}
