package com.crts.app.hm.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Loan;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Integer>{

}
