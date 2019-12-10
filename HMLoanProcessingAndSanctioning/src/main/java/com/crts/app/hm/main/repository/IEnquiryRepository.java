package com.crts.app.hm.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Enquiry;
@Repository
public interface IEnquiryRepository extends CrudRepository<Enquiry, Integer>{
	@Query("select e from Enquiry e  where e.leadNo=?1 ")
	public Enquiry findByLeadNo(String leadNo);

}
