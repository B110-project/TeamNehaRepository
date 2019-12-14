package com.cjc.homeRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cjc.model.Student;

public interface HomeRepository extends CrudRepository<Student, Integer> {
	
	public List<Student> findAllByUnaAndUpas(String uname, String password);



	

}
