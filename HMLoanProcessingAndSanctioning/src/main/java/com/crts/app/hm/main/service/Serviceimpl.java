package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.Dto.EnquiryDto;
import com.crts.app.hm.main.Dto.LoanDto;
import com.crts.app.hm.main.Repository.CustomerRegistrationDetailsRepository;
import com.crts.app.hm.main.Repository.EnquiryDetailsRepository;
import com.crts.app.hm.main.Repository.LoanRepository;
import com.crts.app.hm.main.model.CustomerDetails;
import com.crts.app.hm.main.model.Enquiry;
import com.crts.app.hm.main.model.Loan;
@Service
public class Serviceimpl implements Iservice{
@Autowired
CustomerRegistrationDetailsRepository cr;
@Autowired
EnquiryDetailsRepository err;
@Autowired
LoanRepository lr;

ModelMapper m;

	@Override
	public List<CustomerDetails> getDetail() {
		List<CustomerDetails> cd=(List<CustomerDetails>) cr.findAll();
		return cd;
	}

	@Override
	public CustomerDetails addDetails(CustomerDetails c) {
		CustomerDetails i=cr.save(c);
		return i;
		
	}

	@Override
	public void deleteDetails(int customerId) 
	{
		cr.deleteById(customerId);		
	}

	@Override
	public CustomerDetails editDetails(int customerId) {
		CustomerDetails cd=cr.findById(customerId).get();
		return cd;
	}

	@Override
	public List<CustomerDetails> updateDetails(CustomerDetails c) {
		cr.save(c);
		List< CustomerDetails> cd=(List<CustomerDetails>) cr.findAll();
		return cd;
	}
 
	//Enquiry Crud 
	
	@Override
	public Enquiry getEnquiryDetail(int id) {
		Enquiry e=err.findById(id).get();
		return e;
	}

	@Override
	public List<Enquiry> getAllEnquiryDetails() {
		List<Enquiry> el=(List<Enquiry>) err.findAll();
		return el;
	}

	@Override
	public Enquiry addEnquiryDetails(Enquiry e) {
		Enquiry er=err.save(e);
		return er;
	}

	@Override
	public Enquiry EditEnquiryDetails(int id) {
		Enquiry er=err.findById(id).get();
		return er;
	}

	@Override
	public List<Enquiry> updateEnquiryDetails(Enquiry e) {
		err.save(e);
		List<Enquiry>el=(List<Enquiry>) err.findAll();
		return el;
	}

	@Override
	public void deleteEnquiryDetails(int id) 
	{
		err.deleteById(id);
		
	}
	
	@Override
	public List emiCalculate(LoanDto loandt) {
		
//		loan.setLoanAmount(30000); 
//		loan.setTenure(72);
//		loan.setRateOfInterest(7);
		
		Loan loan = m.map(loandt, Loan.class);
		
		double p = loan.getLoanAmount();
		int t = loan.getTenure();
		
		if (p >= 500000 && p <= 1500000) {
			loan.setRateOfInterest(10);
		} else if (p > 1500000 && p <= 4000000) {
			loan.setRateOfInterest(9);
		} else if (p > 4000000) {
			loan.setRateOfInterest(8.5f);
		} else {
			loan.setRateOfInterest(8.4f);
		}
		float r = loan.getRateOfInterest();
		// Annual Interest Rate
		r /= 1200;
		double emi = (p * r * Math.pow(1 + r, t) / (Math.pow(1 + r, t) - 1));
		emi = Math.round(emi * 100.0) / 100.0;
		loan.setEmiAmount(emi);
		System.out.println(emi);
		double em = loan.getEmiAmount();

		// for Processing Fees as 1% fixed
		double processingFees = p / 100 * 1;
		loan.setProcessingFees(processingFees);

		// Other Charges Calculations
		float otherCharges = (float) (p / 100 * 0.5f);
		loan.setOtherCharges(otherCharges);

		// Total Amount of Total Interest
		double total = (em * t +(processingFees+otherCharges));
		System.out.println(total);
		total = (Math.round(total * 10000.0) / 10000.0);
		loan.setTotalAmount(total);
		loan.setLoanNo("101");
		loan.setLoanType("Home Loan");
		loan.setStatus(1);
		loan.setLeadNo("10");
		
		List l = (List) lr.save(loan);
		return l;
	}

	@Override
	public List<EnquiryDto> approvedStatus(int statusCode) {
		
		List<Enquiry> list = err.findByStatusCode(statusCode);
	System.out.println(list);
	m=new ModelMapper();
		List<EnquiryDto> dto=new ArrayList<EnquiryDto>();
		for(Enquiry l:list) {
			EnquiryDto dto1=m.map(l, EnquiryDto.class);
			dto.add(dto1);
		}
		return dto;
		
	}


	
}
