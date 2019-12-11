package com.crts.app.hm.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Cibil;


@Repository
public interface ICibilRepository extends CrudRepository<Cibil,Integer >{

	@Query("select c.cibilScore from Cibil c where c.leadNo=?1")
	public float findCibilScoreByLeadNo(String leadNo);
}
