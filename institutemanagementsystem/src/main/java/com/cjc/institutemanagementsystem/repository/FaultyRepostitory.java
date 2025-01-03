package com.cjc.institutemanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.institutemanagementsystem.model.Faculty;

@Repository
public interface FaultyRepostitory extends CrudRepository<Faculty, Integer> {

}
