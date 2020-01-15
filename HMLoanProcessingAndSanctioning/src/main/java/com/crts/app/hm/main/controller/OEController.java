package com.crts.app.hm.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.dto.LoanDto;
import com.crts.app.hm.main.model.Loan;
import com.crts.app.hm.main.service.IOEService;

@CrossOrigin("*")
@RestController
public class OEController {

	@Autowired
	IOEService ser;

//OE Details
	@RequestMapping(value = "/generateCibilScore", method = RequestMethod.POST, produces = "Application/json")
	public void generateCibilScore(@RequestBody EnquiryDto enq) {
		ser.generateCibilScore(enq);
	}

	@RequestMapping(value = "/getCibilScore/{leadNo}", method = RequestMethod.GET, consumes = "Application/json")
	public float getCibilScoreByLeadNo(@PathVariable String leadNo) {
		return ser.getCibilScoreByLeadNo(leadNo);
	}

	// Emi To be paid from Customer for a Month
	@RequestMapping(value = "/emiCalculate", method = RequestMethod.POST, produces = "application/json")
	public Loan emiCalculator(@RequestBody Loan loan) {
		loan = ser.emiCalculate(loan);
		// getEmiCalculation(loan);
		System.out.println(loan);
		return loan;
	}

	@RequestMapping(value = "/getEmiData", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public List<Loan> getEmiCalculation(Loan loan) {
		System.out.println(loan);
		List list = new ArrayList();
		list.add(loan);
		return list;
	}

	@RequestMapping(value = "/postEmiData", method = RequestMethod.POST, produces = "application/json")
	public LoanDto postEmiData(@RequestBody LoanDto loanDto) {
		System.out.println("In Oe Controller");
		loanDto = ser.postEmiData(loanDto);
		return loanDto;
	}

}
