package com.crts.app.hm.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.CustomerDetails;

@Repository
public interface CustomerRegistrationDetailsRepository  extends CrudRepository<CustomerDetails, Integer>{

}
