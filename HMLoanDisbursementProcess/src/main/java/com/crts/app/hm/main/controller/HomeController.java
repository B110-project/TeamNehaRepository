package com.crts.app.hm.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	@RequestMapping(value = "/gethmldp")
	public String loandispro()
	{
		
		System.out.println("IN LOAN DISBURSEMENT PROCESS");
		return "hey hello";
	}

}
