package com.crts.app.hm.main.service;


import com.crts.app.hm.main.dto.EnquiryDto;




public interface IOEService {

	public void generateCibilScore(EnquiryDto enq);
	
	public float getCibilScoreByLeadNo(String leadNo);
}
