package com.crts.app.hm.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.CustomerDetails;

@Repository
public interface ICustomerDetailsRepository extends CrudRepository<CustomerDetails, Integer>{

}
