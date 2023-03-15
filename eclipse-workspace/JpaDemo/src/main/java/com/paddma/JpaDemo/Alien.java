package com.paddma.JpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien
{

	
	@Id
	private int id;
	private String aname;
	private String tech;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
	
}
