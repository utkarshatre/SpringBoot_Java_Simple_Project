package com.example.demo1;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
private int eid;
private String ename;
private String  epost;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEpost() {
	return epost;
}
public void setEpost(String epost) {
	this.epost = epost;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", epost=" + epost + "]";
}

}
