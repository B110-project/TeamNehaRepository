package com.crts.app.hm.main.controller;

import java.util.List;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crts.app.hm.main.customeexception.EnquiryDetailNotAvailableException;
import com.crts.app.hm.main.dto.CibilDto;
import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.dto.ResponseDto;
import com.crts.app.hm.main.service.ICMService;
import com.crts.app.hm.main.service.IOEService;

@CrossOrigin("*")
@RestController
public class CMController {
	@Autowired
	ICMService cmService;

	@Autowired
	IOEService ioService;

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	Logger logger;

	@RequestMapping(value = "/getAllcibilScore", method = RequestMethod.GET, produces = "application/json")
	public List<CibilDto> getAllCibil() {
		
		System.out.println("************************************");
		logger.info("in getCibilScore() ");
		System.out.println("************************************");
		List<CibilDto> list = cmService.getAllCibilScore();
		return list;
	}


	@RequestMapping(value = "getCibilStatus/{leadNo}", method = RequestMethod.GET, produces = "application/json")
	public ResponseDto getSingleCibilScore(@PathVariable String leadNo) {
		System.out.println("****************************");
		logger.info("getting CibilStatus byleadNo");
		System.out.println("*****************************");
		System.out.println(leadNo);
		float cibilScore = ioService.getCibilScoreByLeadNo(leadNo);
		System.out.println(cibilScore);
		if (cibilScore >= 600) {
			ResponseDto response = new ResponseDto();
			response.setMsg("Cibil Score checked");
			return response;

		} else {
			ResponseDto response = new ResponseDto();
			response.setMsg("Cibil Score pending");
			return response;
		}

	}


	@RequestMapping(value = "/getEnquiryDetails/{leadNo}", method = RequestMethod.GET, produces = "application/json")
	public EnquiryDto getSingleEnquiryDetails(@PathVariable("leadNo") String leadNo) throws EnquiryDetailNotAvailableException {
		System.out.println("***********************");
		logger.info("getting Enquiry Details by particular leadNo");
		System.out.println("*************************");
		EnquiryDto dto = cmService.getEnquiryDetails(leadNo);
		return dto;
	}

	@RequestMapping(value = "/getApprovalRequest", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public ResponseDto getApprovalRequest(@RequestBody EnquiryDto enquiryDto) {
		System.out.println("*****************************");
		logger.info(" in getApprovalRequest");
		System.out.println("**********************************");
		int enquiryId = enquiryDto.getEnquiryId();
		int statusCode = enquiryDto.getStatusCode();
		cmService.getApprovalRequest(statusCode, enquiryId);
		ResponseDto response=new ResponseDto();
		response.setMsg("Approved");
		return response;
	}
	
	@RequestMapping(value="/getPendingRequest",method=RequestMethod.PUT,produces = "application/json",consumes = "application/json")
	public ResponseDto getPendingRequest(@RequestBody EnquiryDto enquiryDto) {
		System.out.println("*************************");
		logger.info("in getPendingRequest");
		int enquiryId=enquiryDto.getEnquiryId();
		int statusCode=enquiryDto.getStatusCode();
		cmService.getPendingRequest(statusCode, enquiryId);
		
		ResponseDto response=new ResponseDto();
		response.setMsg("Pending");
		return response;
	}

}
