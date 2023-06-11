package com.example.demo1;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpContoller {
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("first")
	public String first(Employee e) {
		return "insert.jsp";
	}
	@RequestMapping("validate")
	public String insert(Employee e) {
		repo.save(e);
		return "insert.jsp";
	}
	@RequestMapping("fbyid")
	public String diplay(HttpSession h, Integer eid) {
		Employee e=repo.findById(eid).orElse(null);
		h.setAttribute("eid",e.getEid());
		h.setAttribute("ename", e.getEname());
		h.setAttribute("epost", e.getEpost());
		return "view.jsp";
	}
	@RequestMapping("dbyid")
	public String delete(HttpSession h, Integer eid) {
		Employee e=repo.findById(eid).orElse(null);
		if(e!=null) {
			repo.deleteById(eid);
			h.setAttribute("eid",eid);
			return "delete.jsp";
		}
		else {
			h.setAttribute("eid",eid);
			return "insert.jsp";
		}	
	}
	
	@RequestMapping("fetchall")
	@ResponseBody
	public List findAllList(Employee e){
			List<Employee> list=repo.findAllList(e);
			return list;
		}     
	@RequestMapping("fbyname")
	@ResponseBody
	public List<Employee> findbyemp(String ename){
		List<Employee> list = repo.findByEname(ename);
		return list;
	}
	@RequestMapping("sbyid")
	@ResponseBody
	public List<Employee> sortById(Integer eid){
		List<Employee> list= repo.sortById(eid);
		return list;
	}
}
