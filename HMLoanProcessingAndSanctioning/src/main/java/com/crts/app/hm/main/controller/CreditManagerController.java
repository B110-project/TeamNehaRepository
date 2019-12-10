package com.crts.app.hm.main.controller;

import java.util.List;

import javax.rmi.CORBA.Stub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crts.app.hm.main.dto.CibilDto;
import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.service.ICreditManagerService;
import com.crts.app.hm.main.service.IOEService;
@CrossOrigin("*")
@RestController
public class CreditManagerController {
	@Autowired
	ICreditManagerService cmService;

	@Autowired
	IOEService ioService;
	
	@Autowired
	RestTemplate restTemplate;
	
	 @RequestMapping(value = "/getAllcibilScore", method = RequestMethod.GET, produces = "application/json")
	 public List<CibilDto> getAllCibil()
	 {
		List<CibilDto> list= cmService.getAllCibilScore();
		return list;
	 }
	 //return statusCode
	 @RequestMapping(value="getCibilStatus",method = RequestMethod.GET)
	 public int  getSingleCibilScore(@RequestBody CibilDto cibil) {
		 String leadNo=cibil.getLeadNo();
		 float cibilScore=cibil.getCibilScore();
		 List<StatusMasterDto> dto1=cmService.getStatusCode();
		 System.out.println(dto1.toString());
		 for(StatusMasterDto d:dto1) {
			 System.out.println(d.getStatusCode());
			 System.out.println();
			int code=d.getStatusCode();
			 String statusname=d.getStatusName();
			 }
			 
		if(cibilScore>=700) {
			return 105;
		}
		else
		{
			return 120;
		}
		 
	 }
	 
	 @RequestMapping(value="/getEnquiryDetails/{leadNo}",method = RequestMethod.GET,produces = "application/json")
	 public EnquiryDto getEnquiryDetails(@PathVariable("leadNo") String leadNo) {
		 EnquiryDto dto=cmService.getEnquiryDetails(leadNo); 
		 return dto;
	 }
	 

}
