package com.cjc.institutemanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.institutemanagementsystem.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
