package com.crts.app.hm.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.StatusMaster;
@Repository
public interface IStatusMasterRepository extends CrudRepository<StatusMaster, Integer>{
	
	
}
