package com.example.demo1;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Integer > {
	@Query(value="select * from employee where ename=?1",nativeQuery=true)
	List<Employee> findByEname(String ename);
	@Query(value="select * from employee",nativeQuery=true)
	List<Employee> findAllList(Employee e);
	@Query(value="select * from employee order by eid desc",nativeQuery=true)
	List<Employee> sortById(Integer eid);
}
