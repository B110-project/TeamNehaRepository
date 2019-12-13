package com.crts.app.hm.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.EnquiryDto;

import com.crts.app.hm.main.service.IOEService;
@CrossOrigin("*")
@RestController

public class OEController {

	@Autowired
	IOEService ser;
	
	

	@RequestMapping(value = "/generateCibilScore", method = RequestMethod.POST, produces = "Application/json")
	public void generateCibilScore(@RequestBody EnquiryDto enq) {
		ser.generateCibilScore(enq);
	}

	@RequestMapping(value = "/getCibilScore/{leadNo}", method = RequestMethod.GET, consumes = "Application/json")
	public float getCibilScoreByLeadNo(@PathVariable String leadNo) {
		return ser.getCibilScoreByLeadNo(leadNo);
	}

}
