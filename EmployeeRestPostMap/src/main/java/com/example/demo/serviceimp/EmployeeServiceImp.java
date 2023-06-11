package com.example.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.repo.EmployeeRepo;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	EmployeeRepo repo;
	@Override
	public Employee addEmp(Employee e) {
		return repo.save(e);
	}

	@Override
	public Employee getbyId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmp(Employee e) {
		Employee e1 = repo.findById(e.getId()).orElse(null);
		if(e1!=null) {
			e1.setId(e.getId());
			e1.setName(e.getName());
			e1.setPost(e.getPost());
			e1.setSal(e.getSal());
			return repo.save(e1);
		}
		
		else {
			return repo.save(e);
		}
	}

	@Override
	public Employee deleteEmp(int id) {
		repo.deleteById(id);
		return null;
	}

}
