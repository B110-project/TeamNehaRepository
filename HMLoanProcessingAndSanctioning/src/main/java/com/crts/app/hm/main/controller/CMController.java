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
import com.crts.app.hm.main.dto.ResponseDto;
import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.service.ICMService;
import com.crts.app.hm.main.service.IOEService;

@CrossOrigin("*")
@RestController
public class CMController {
	@Autowired
	ICMService cmService;
	
	@Autowired
	IOEService ser;
	
	@Autowired
	IOEService ioService;

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/getAllcibilScore", method = RequestMethod.GET, produces = "application/json")
	public List<CibilDto> getAllCibil() {
		List<CibilDto> list = cmService.getAllCibilScore();
		return list;
	}

	// return statusCode

	@RequestMapping(value = "getCibilStatus/{leadNo}", method = RequestMethod.GET, produces = "application/json")
	public  ResponseDto getSingleCibilScore(@PathVariable String leadNo) {
		System.out.println(leadNo);
		float cibilScore=ser.getCibilScoreByLeadNo(leadNo);
		System.out.println(cibilScore);
		
		/*
		 * List<StatusMasterDto> dto1 = cmService.getStatusCode();
		 * System.out.println(dto1.toString()); for (StatusMasterDto d : dto1) {
		 * System.out.println(d.getStatusCode()); System.out.println(); int code =
		 * d.getStatusCode(); String statusname = d.getStatusName(); }
		 */
		if(cibilScore>=600) {
			ResponseDto response=new ResponseDto();
			response.setMsg("Cibil Score checked");
			return response;
			
		}
		else
		{
			ResponseDto response=new ResponseDto();
			response.setMsg("Cibil Score pending");
			return response;
		}


	}
	
	public void cibilCheckResponse()
	{
		
		
	}
	
                             
	
	@RequestMapping(value = "/getEnquiryDetails/{leadNo}", method = RequestMethod.GET, produces = "application/json")
	public EnquiryDto getEnquiryDetails(@PathVariable("leadNo") String leadNo) 
	{
		EnquiryDto dto = cmService.getEnquiryDetails(leadNo);
		return dto;
	}
	
	@RequestMapping(value="/getCmPermissionRequest",method=RequestMethod.PUT, produces = "application/json",consumes = "application/json")
	public EnquiryDto getApprovalRequest(@RequestBody EnquiryDto enquiryDto) 
	{
		
		int enquiryId=enquiryDto.getEnquiryId();
		int statusCode=enquiryDto.getStatusCode();
		EnquiryDto dto=cmService.getApprovalRequest(statusCode,enquiryId);
		return dto;
	}

	

}
