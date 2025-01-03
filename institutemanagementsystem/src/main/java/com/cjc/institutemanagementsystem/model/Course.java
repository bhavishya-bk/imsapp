package com.cjc.institutemanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	private int cid;
	private String cname;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Faculty> lfaculty=new ArrayList<Faculty>();
	
	
	
	public List<Faculty> getLfaculty() {
		return lfaculty;
	}
	public void setLfaculty(List<Faculty> lfaculty) {
		this.lfaculty = lfaculty;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	 

}
