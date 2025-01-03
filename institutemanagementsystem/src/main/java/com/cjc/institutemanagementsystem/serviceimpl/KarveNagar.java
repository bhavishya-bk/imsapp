package com.cjc.institutemanagementsystem.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.institutemanagementsystem.model.Course;
import com.cjc.institutemanagementsystem.model.Faculty;
import com.cjc.institutemanagementsystem.repository.CourseRepository;
import com.cjc.institutemanagementsystem.repository.FaultyRepostitory;
import com.cjc.institutemanagementsystem.servicei.Cjc;
@Service
public class KarveNagar implements Cjc {
	@Autowired
	CourseRepository cr;
	@Autowired
	FaultyRepostitory fr;

	@Override
	public void addCourse(Course c) {
		cr.save(c);
		
		
	}

	@Override
	public List<Course> getCourse() {
		return (List<Course>) cr.findAll();
	}

	

	@Override
	public String addFaculty(String fname, int cid) {
		Optional<Course> byId = cr.findById(cid);
		if(byId.isPresent()) {
			Course course = byId.get();
			Faculty f=new Faculty();
			f.setFname(fname);
			f.getLcourse().add(course);
			course.getLfaculty().add(f);
			fr.save(f);
			return "success";
		}
		else
			return "fail";
	}

	@Override
	public List<Faculty> getFaculty() {
		
		return (List<Faculty>) fr.findAll();
	}

	
	

}
