package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("create")
	ResponseEntity<Employee> addEmployee(@RequestBody Employee e){
		return new ResponseEntity<Employee>(service.addEmp(e),HttpStatus.CREATED);
	}
	
	@PutMapping("update")
	ResponseEntity<Employee> modifyEmployee(@RequestBody Employee e1){
		return new ResponseEntity<Employee>(service.updateEmp(e1),HttpStatus.OK);
	}
	@GetMapping("read")
	ResponseEntity<Employee> readById(@RequestHeader int id){
		return new ResponseEntity<Employee>(service.getbyId(id),HttpStatus.FOUND);
	}
	
	@DeleteMapping("delete")
	ResponseEntity<Employee> deleteEmployee(@RequestHeader int id){
		return new ResponseEntity<Employee>(service.deleteEmp(id),HttpStatus.OK);
	}
}
