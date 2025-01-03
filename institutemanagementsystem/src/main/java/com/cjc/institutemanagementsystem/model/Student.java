package com.cjc.institutemanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Batch> lbatch=new ArrayList<Batch>();
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Batch> getLbatch() {
		return lbatch;
	}
	public void setLbatch(List<Batch> lbatch) {
		this.lbatch = lbatch;
	}
	
	
	

}
