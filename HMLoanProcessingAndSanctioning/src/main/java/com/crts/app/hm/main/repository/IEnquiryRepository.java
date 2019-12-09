package com.crts.app.hm.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Enquiry;
@Repository
public interface IEnquiryRepository extends CrudRepository<Enquiry, Integer>{

}
