package com.example.demo.dao;
import org.*;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
