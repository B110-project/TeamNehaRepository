package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crts.app.hm.main.Dto.LoanDto;
import com.crts.app.hm.main.service.Iservice;

@RestController
public class OEController {
	
	@Autowired
	Iservice ser;
	
//  Emi To be paid from Customer for a Month
	@RequestMapping("/emiCalculate")
	public List emiCalculator(@ModelAttribute LoanDto loan) {
		
		List l=ser.emiCalculate(loan);
		return l;
	}


}
