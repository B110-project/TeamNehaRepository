package com.crts.app.hm.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Loan;

@Repository
public interface ILoanRepository extends CrudRepository<Loan, Integer>{

	//@Query("Select l from Loan l where l.customer_details_customer_id=?1")
	public Loan findByCustomerDetails_customerId(int customerId);
}
