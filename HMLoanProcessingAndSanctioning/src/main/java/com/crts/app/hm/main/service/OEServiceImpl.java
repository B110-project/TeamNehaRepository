package com.crts.app.hm.main.service;

import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.dto.LoanDto;
import com.crts.app.hm.main.model.Cibil;
import com.crts.app.hm.main.model.Loan;
import com.crts.app.hm.main.repository.ICibilRepository;
import com.crts.app.hm.main.repository.LoanRepository;

@Service
public class OEServiceImpl implements IOEService {
	@Autowired
	LoanRepository lr;

	@Autowired
	ICibilRepository repo;
	
	
	

	@Override
	public void generateCibilScore(EnquiryDto enq) {

		Random rand = new Random();

		// nextInt as provided by Random is exclusive of the top value so you need to
		// add 1

		float cibilScore = rand.nextInt((900 - 500) + 1) + 500;

		Cibil c = new Cibil();
		c.setCibilScore(cibilScore);
		c.setLeadNo(enq.getLeadNo());
		c.setCibilStatus(0);

		ModelMapper mm = new ModelMapper();
		Cibil c1 = mm.map(c, Cibil.class);
		repo.save(c1);

	}

	@Override
	public float getCibilScoreByLeadNo(String leadNo) {

		return repo.findCibilScoreByLeadNo(leadNo);

	}
	
	//Emi loan calculations

	@Override
	public Loan postLoanData(Loan loan) {

		return lr.save(loan);
	}

	@Override
	public Loan emiCalculate(Loan loan) {

		double p = loan.getLoanAmount();
		int t = loan.getTenure();

		if (p >= 500000 && p <= 1500000) {
			loan.setRateOfInterest(10);
		} else if (p > 1500000 && p <= 4000000) {
			loan.setRateOfInterest(9);
		} else if (p > 4000000) {
			loan.setRateOfInterest(8.5f);
		} else {
			loan.setRateOfInterest(10);
		}
		float r = loan.getRateOfInterest();

		// Annual Interest Rate

		r /= 1200;
		double emi = (p * r * Math.pow(1 + r, t) / (Math.pow(1 + r, t) - 1));
		emi = Math.round(emi * 1000.0) / 1000.0;
		loan.setEmiAmount(emi);

		double em = loan.getEmiAmount();

		System.out.println(em);
		// for Processing Fees as 2.5% fixed

		double processingFees = p / 100 * 2.5;
		loan.setProcessingFees(processingFees);

		// Other Charges Calculations

		float otherCharges = (float) (p / 100 * 0.5f);
		loan.setOtherCharges(otherCharges);

		// Total Amount of Total Interest

		double total = (em * t + (processingFees + otherCharges));
		System.out.println(total);
		total = (Math.round(total * 10000.0) / 10000.0);
		loan.setTotalAmount(total);

		/*
		 * List list=new ArrayList(); list.add(loan);
		 * 
		 * System.out.println(list);
		 */

		return loan;
	}

	@Override
	public LoanDto postEmiData(LoanDto loanDto) {
		System.out.println("In Service Impl");
		ModelMapper m = new ModelMapper();
		Loan loan = m.map(loanDto, Loan.class);
		lr.save(loan);

		return loanDto;
	}

}
