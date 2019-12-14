package com.crts.app.hm.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Branch;
import com.crts.app.hm.main.model.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer> {

	
}
