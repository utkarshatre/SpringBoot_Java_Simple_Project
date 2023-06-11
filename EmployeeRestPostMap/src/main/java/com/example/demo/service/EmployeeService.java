package com.example.demo.service;

import com.example.demo.model.Employee;

public interface EmployeeService {
Employee addEmp(Employee e);
Employee getbyId(int id);
Employee updateEmp(Employee e);
Employee deleteEmp(int id);

}
