package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.Dto.EnquiryDto;
import com.crts.app.hm.main.model.CustomerDetails;
import com.crts.app.hm.main.model.Enquiry;
import com.crts.app.hm.main.service.Iservice;

@CrossOrigin("*")
@RestController
public class REController {

	@Autowired
	Iservice sf;
	
	CustomerDetails cm=new CustomerDetails();
	Enquiry e=new Enquiry();
	@RequestMapping(value="/getdata")
	public List<CustomerDetails> getdata()
	{
		List<CustomerDetails>cd=sf.getDetail();
		return cd;
		
	}
	@RequestMapping(value="/adddata")
	public CustomerDetails addcustomer(@RequestBody CustomerDetails cd1)
	{
		
	CustomerDetails cd=	sf.addDetails(cd1);
	return cd;
		
	}
	@RequestMapping(value = "/deletedata")
	public  void deleteCustomer(@RequestBody CustomerDetails cd1)
	{
		sf.deleteDetails(cd1.getCustomerId());
	}
	@RequestMapping(value="/editdata")
	public CustomerDetails editcustomer(@RequestBody CustomerDetails cd1)
	{
		CustomerDetails cl=(CustomerDetails) sf.editDetails(cd1.getCustomerId());
		return cl;
	}
	
	@RequestMapping(value="/updatedata")
	public List<CustomerDetails> updatecustomer(@RequestBody CustomerDetails cd1)
	{
		List<CustomerDetails> cl=sf.updateDetails(cd1);
		return cl;
	}
	
	//Enquiry crud c mapping 
	@RequestMapping(value = "/getsingleenquiry")
	public Enquiry getSingleEnquiry(@RequestBody Enquiry er)
	{
		Enquiry eru=sf.getEnquiryDetail(er.getEnquiryId());
		return eru;
	}
	@RequestMapping(value = "/getallenquiry")
	public List<Enquiry> getAllEnquiry()
	{
		List<Enquiry> el=sf.getAllEnquiryDetails();
		return el;
	}
	@RequestMapping(value = "/addenquiry")
	public Enquiry addEnquiry(@RequestBody Enquiry e)
	{
		Enquiry ee=sf.addEnquiryDetails(e);
		return ee;
	}
	@RequestMapping(value = "/editenquiry")
	public Enquiry EditEnquiry(@RequestBody Enquiry e)
	{
		Enquiry ee=sf.EditEnquiryDetails(e.getEnquiryId());
		return ee;
	}
	
	@RequestMapping(value = "/updateenquiry")
	public List<Enquiry> updateEnquiryDetails(@RequestBody Enquiry e)
	{
		List<Enquiry> el=sf.updateEnquiryDetails(e);
		return el;
	}
	@RequestMapping(value = "/deleteenquiry")
	public  void deleteEnquiry(@RequestBody Enquiry e)
	{
		sf.deleteEnquiryDetails(e.getEnquiryId());
	}
	
	@RequestMapping(value="/getEnquiryDetailsByStatusCode/{statusCode}", method = RequestMethod.GET, produces="application/json")
	public List<EnquiryDto> getEnquiryDetailByStatusCode(@PathVariable int statusCode){
		List<EnquiryDto> dto=sf.approvedStatus(statusCode);
		return dto;
	}

	
}
