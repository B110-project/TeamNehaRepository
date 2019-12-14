package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.LedgerDto;
import com.crts.app.hm.main.model.Disbursement;
import com.crts.app.hm.main.service.Iservice;
@CrossOrigin("*")
@RestController
public class AccountHeadController {

	@Autowired
	Iservice si;
	
	//Dummy Disbursment process
	@RequestMapping("/disburment")
	public String disbursment(Disbursement d) {
		
		si.disbursment(d);
		return "Amount disbursment succefully";
		
	}
	
	//Get Disbursment Data for Ledger Calculation
	@RequestMapping(value="/getDisbursment", method = RequestMethod.GET, produces = "application/json")
	public List<Disbursement> getDisbursmentInfo(){
		
		List<Disbursement> list= si.getDisburmentData();
		return list;
	}
	
	/*
	 * @RequestMapping(value="/getDisbursment/{status}", method = RequestMethod.GET,
	 * produces = "application/json") public List<Disbursement>
	 * getDisbursmentInfo(@PathVariable int status){
	 * 
	 * List<Disbursement> list= si.getDisburmentData(status); return list; }
	 */
	
	//Generate Ledger Data
	@RequestMapping(value="/ledgerGenerate",method= RequestMethod.POST,produces = "application/json",consumes="application/json")
	public LedgerDto ledgerGeneration(@RequestBody LedgerDto ledger) {
			
		si.ledgerGeneration(ledger);
		System.out.println(ledger.getEmiAmount());
		
		return ledger;
		
	}
	
	//Get Ledger Data For Perticular Loan Number
	@RequestMapping(value="/getdata/{loanNo}", method= RequestMethod.GET, produces = "application/json")
	public List<LedgerDto> getLedgerData(@PathVariable String loanNo) {
		
		List<LedgerDto> list=si.getData(loanNo);
		return list;
	}
}
