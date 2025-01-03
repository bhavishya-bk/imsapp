package com.cjc.institutemanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Faculty> lfaculty=new ArrayList<Faculty>();
	@OneToMany(cascade = CascadeType.ALL)
	private List<Student> lstudent=new ArrayList<Student>();
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public List<Faculty> getLfaculty() {
		return lfaculty;
	}
	public void setLfaculty(List<Faculty> lfaculty) {
		this.lfaculty = lfaculty;
	}
	public List<Student> getLstudent() {
		return lstudent;
	}
	public void setLstudent(List<Student> lstudent) {
		this.lstudent = lstudent;
	}
	
	
	

}
