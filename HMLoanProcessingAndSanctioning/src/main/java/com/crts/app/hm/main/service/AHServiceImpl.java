package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.LedgerDto;
import com.crts.app.hm.main.model.Disbursement;
import com.crts.app.hm.main.model.Ledger;
import com.crts.app.hm.main.repository.IDisbursementRepository;
import com.crts.app.hm.main.repository.IledgerRepository;

@Service
public class AHServiceImpl implements IAHService {

	ModelMapper m=new ModelMapper();
	@Autowired
	IledgerRepository lr;
	
	@Autowired
	IDisbursementRepository dr;
	
	@Override
	public LedgerDto ledgerGeneration(LedgerDto ledgerdto) {
		
		
		Ledger ledger=m.map(ledgerdto, Ledger.class );
		List<Ledger> l=new ArrayList();
		/*
		 * Ledger l1=m.map(ledger, Ledger.class );
		 */
		System.out.println(ledger.getLoanAmount());
		double loanAmount= ledger.getLoanAmount();
		//double loanAmount=30000;
		int tenure= ledger.getTenure();
		//int tenure=12;
		double totalAmount= 0;
		int tenure1= ledger.getTenure();
		//int tenure1=12;
		float rateOfInterest=ledgerdto.getRateOfInterest();
		//float rateOfInterest=8;
		String leadNo= ledger.getLeadNo();
		String loanNo= ledger.getLoanNo();
		
		for(int j=1; j<=(tenure1+1); j++) {
		
		Ledger ledger1=new Ledger();	
		//Ledger ledger=m.map(ledgerdto, Ledger.class );
		if(loanAmount!=0) {
		ledger1.setLoanAmount(loanAmount);
		double p=ledger1.getLoanAmount();
		
		ledger1.setTenure(tenure);
		int t=ledger1.getTenure();
		
		ledger1.setRateOfInterest(rateOfInterest);
		float r=ledger1.getRateOfInterest();
		
		Date date=new Date();
		ledger1.setEmiDueDate(date);
		ledger1.getEmiDueDate();
		
		//Rate of interest
		r/=1200;
		
		//Emi Calculations
		double emi=(p*r*Math.pow(1+r, t)/(Math.pow(1+r,  t)-1));
		emi=Math.round(emi*100)/100.0;
		ledger1.setEmiAmount(emi);
		double ld= ledger1.getEmiAmount();
		
		System.out.println(emi);
		
		//Interest Amount calculation
		double interest = r*p;
		interest=Math.round(interest);
		ledger1.setInterest(interest);
		double i=ledger1.getInterest();
		
		//Principal Amount calculation
		double principal=emi-interest;
		principal=Math.round(principal);
		ledger1.setPrincipal(principal);
		double p1=ledger1.getPrincipal();
		
		//Closing Amount calculation
		double closingAmount=p-principal;
		ledger1.setClosingAmount(closingAmount);
		ledger1.getClosingAmount();
		
		//Total Amount calculation
	    totalAmount= totalAmount+emi;
	    ledger1.setTotalAmount(totalAmount);	
	    ledger1.setLeadNo(leadNo);
	    ledger1.setLoanNo(loanNo);
		
		tenure=tenure-1;
		loanAmount=closingAmount;
		l.add(ledger1);  //Adding ledger Object to List
		}
		}
	    lr.saveAll(l);
		
		return ledgerdto;	
	}

	@Override
	public List<LedgerDto> getData(String loanNo) {
	
		//String loanNo=ledgerDto.getLoanNo();
		List<LedgerDto> list=new ArrayList<LedgerDto>();
		//List<Ledger> list1= (List<Ledger>) lr.findAll();
		Ledger ledger =new Ledger();
		//String loanNo=ledger.getLoanNo();
		List<Ledger> list1= (List<Ledger>) lr.findByLoanNo(loanNo);

		for(Ledger l: list1) {
			LedgerDto dt=m.map(l, LedgerDto.class);
			list.add(dt);
		}
		return list;
	}

	@Override
	public String disbursment(Disbursement d) {
		
		d.setLeadNo("3");
		d.setLoanNo("1236");
		d.setName("AkshayLomte");
		d.setAddress("Pune");
		d.setLoanAmount(30000);
		d.setRateOfInterest(8);
		d.setTenure(12);
		d.setEmi(2610);
		d.setStatus(15);
		
		dr.save(d);
		return "Succefully";
	}

	/*
	 * @Override public List<Disbursement> getDisburmentData(int status) { //int
	 * status=d.getStatus(); List<Disbursement> list=dr.findByStatus(status);
	 * 
	 * return list; }
	 */

	@Override
	public List<Disbursement> getDisburmentData() {
		List<Disbursement> list=(List<Disbursement>) dr.findAll();
		return list ;
	}

}
