package com.cjc.institutemanagementsystem.servicei;

import java.util.List;

import com.cjc.institutemanagementsystem.model.Course;
import com.cjc.institutemanagementsystem.model.Faculty;
import com.cjc.institutemanagementsystem.model.Student;

public interface Cjc {

	public void addCourse(Course c);

	public List<Course> getCourse();


	public String addFaculty(String fname, int cid);

	public List<Faculty> getFaculty();

}
