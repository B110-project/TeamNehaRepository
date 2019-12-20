package com.crts.app.hm.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Cibil;
import com.crts.app.hm.main.model.StatusMaster;
@Repository
public interface ICMRepository extends CrudRepository<Cibil, Integer>{

	
}
