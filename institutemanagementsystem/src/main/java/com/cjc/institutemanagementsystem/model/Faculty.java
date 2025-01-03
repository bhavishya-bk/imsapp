package com.cjc.institutemanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String fname;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Course> lcourse=new ArrayList<Course>();
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Batch> lbatch=new ArrayList<Batch>();
	
	
	public List<Course> getLcourse() {
		return lcourse;
	}
	public void setLcourse(List<Course> lcourse) {
		this.lcourse = lcourse;
	}
	public List<Batch> getLbatch() {
		return lbatch;
	}
	public void setLbatch(List<Batch> lbatch) {
		this.lbatch = lbatch;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	

}
