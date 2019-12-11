package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.CibilDto;
import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.model.Enquiry;

public interface ICMService 
{
	
	public List<Enquiry> enquiryDeatils(); 
	public List<CibilDto> getAllCibilScore();
	public List<StatusMasterDto> getStatusCode();
	public EnquiryDto getEnquiryDetails(String leadNo);
	public EnquiryDto getApprovalRequest(int statusCode,int enquiryId);

}
