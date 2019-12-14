package com.crts.app.hm.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.CustomerDetails;
import com.crts.app.hm.main.model.Enquiry;

@Repository
public interface EnquiryDetailsRepository  extends CrudRepository<Enquiry, Integer>{
	
//	@Query("select statusCode from Enquiry where statusCode=?1")
	//public List<Enquiry> getEnquiryDetailsByStatusCode(int statusCode);
	public List<Enquiry> findByStatusCode(int statusCode);

}