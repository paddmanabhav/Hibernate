package com.hibmapdemo.Hibmapreldemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {

	@Id
	private int  rollno;
	private int mark;
	private String name;
	
	@ManyToMany(mappedBy = "student")
	private List<Laptop> laptop  = new ArrayList<Laptop>(); 

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", mark=" + mark + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	
}
