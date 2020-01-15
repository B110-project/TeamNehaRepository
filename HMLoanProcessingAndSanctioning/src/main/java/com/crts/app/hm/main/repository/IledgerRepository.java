package com.crts.app.hm.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Ledger;

@Repository
public interface IledgerRepository extends CrudRepository<Ledger, Integer>{

   public List<Ledger> findByLoanNo(String loanNo);
}
