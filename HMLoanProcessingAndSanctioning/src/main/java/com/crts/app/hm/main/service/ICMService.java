package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.customeexception.EnquiryDetailNotAvailableException;
import com.crts.app.hm.main.dto.CibilDto;
import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.model.Enquiry;

public interface ICMService 
{
	 
	public List<CibilDto> getAllCibilScore();
	public EnquiryDto getEnquiryDetails(String leadNo) throws EnquiryDetailNotAvailableException;
	public void getApprovalRequest(int statusCode,int enquiryId);
	public void getPendingRequest(int statusCode,int enquiryId);

}
