package com.crts.app.hm.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.Repository.CustomerRegistrationDetailsRepository;
import com.crts.app.hm.main.Repository.EnquiryDetailsRepository;
import com.crts.app.hm.main.model.CustomerDetails;
import com.crts.app.hm.main.model.Enquiry;
@Service
public class Serviceimpl implements Iservice{
@Autowired
CustomerRegistrationDetailsRepository cr;
@Autowired
EnquiryDetailsRepository err;

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

	
}
