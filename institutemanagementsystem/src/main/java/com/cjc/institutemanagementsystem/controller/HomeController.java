package com.cjc.institutemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.institutemanagementsystem.model.Course;
import com.cjc.institutemanagementsystem.model.Faculty;
import com.cjc.institutemanagementsystem.model.Student;
import com.cjc.institutemanagementsystem.servicei.Cjc;

@Controller
public class HomeController {
	@Autowired
	Cjc ssi;
	
	@RequestMapping("/")
	public String prelogin() {
		return "index";
	}
	
	@RequestMapping("/addcourse")
	public String coursedetail() {
		return "course";
	}
	
	@RequestMapping("/addcoursedoa")
	public String addCourse(@ModelAttribute Course c) {
		System.out.println(c.getCname());
		ssi.addCourse(c);
		
		return "index";
	}
	
	
	
	@RequestMapping("/viewcourse")
	public String coursedata(Model m) {
		List<Course> ls=ssi.getCourse();
		System.out.println(ls);
		m.addAttribute("data", ls);
		return "getcourse";
	}
	
	@RequestMapping("/addfaculty")
	public String facultydetail() {
		return "faculty";
	}
	
	@RequestMapping("/addfacultydao")
	public String addFaculty(@RequestParam("fname") String fname,@RequestParam("cid") int cid,Model m) {
		String faculty = ssi.addFaculty(fname,cid);
		System.out.println(faculty);
		m.addAttribute("msg", faculty);
		if(faculty.equals("success")) {
			return "index";
		}
		else {
		return "faculty";
		}
	}
	
	@RequestMapping("viewfaculty")
	public String facultyData(Model m) {
		List<Faculty> ls=ssi.getFaculty();
		m.addAttribute("data", ls);
		return "getfaculty";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
