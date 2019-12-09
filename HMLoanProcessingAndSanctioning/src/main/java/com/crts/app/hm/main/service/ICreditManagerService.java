package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.CibilDto;
import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.model.Enquiry;

public interface ICreditManagerService {
	
	public List<Enquiry> enquiryDeatils(); 
	public List<CibilDto> getAllCibilScore();
	public List<StatusMasterDto> getStatusCode(); 

}
