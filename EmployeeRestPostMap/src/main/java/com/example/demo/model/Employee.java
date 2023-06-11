package com.example.demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
private String name;
private int sal;
private String post;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", post=" + post + "]";
}
}
