package com.crts.app.hm.main.controller;

import java.util.List;

import javax.rmi.CORBA.Stub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crts.app.hm.main.dto.CibilDto;
import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.service.ICreditManagerService;

@RestController
public class CreditManagerController {
	@Autowired
	ICreditManagerService cmService;

	@Autowired
	RestTemplate restTemplate;
	
	 @RequestMapping(value = "/getallcibilscore", method = RequestMethod.GET, consumes  =  "application/json")
	 public List<CibilDto> getAllCibil()
	 {
		List<CibilDto> list= cmService.getAllCibilScore();
		return list;
	 }
	 //return statusCode
	 @RequestMapping(value="getC",method = RequestMethod.POST)
	 public int  getSingleCibilScore(@RequestBody CibilDto dto) {
		float cibilScore= dto.getCibilScore();
		 List<StatusMasterDto> dto1=cmService.getStatusCode();
		 int code=120;
		 System.out.println(dto1.toString());
		 for(StatusMasterDto d:dto1) {
			 System.out.println(d.getStatusCode());
			 System.out.println();
			 code=d.getStatusCode();
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
	 
	 

}
