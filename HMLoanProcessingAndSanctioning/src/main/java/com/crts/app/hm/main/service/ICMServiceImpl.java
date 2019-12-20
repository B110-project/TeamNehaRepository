package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.customeexception.EnquiryDetailNotAvailableException;
import com.crts.app.hm.main.dto.CibilDto;
import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.model.Cibil;
import com.crts.app.hm.main.model.Enquiry;
import com.crts.app.hm.main.repository.ICMRepository;
import com.crts.app.hm.main.repository.IEnquiryRepository;
import com.crts.app.hm.main.repository.IStatusMasterRepository;

@Service
public class ICMServiceImpl implements ICMService {

	@Autowired
	ICMRepository icm;

	@Autowired
	IStatusMasterRepository istatusMaster;

	@Autowired
	IEnquiryRepository ienquiry;

	@Autowired
	Logger logger;

	ModelMapper modelMapper = new ModelMapper();


	@Override
	public List<CibilDto> getAllCibilScore() {
		logger.info("in service getAllCibilScore");
		List<CibilDto> list1 = new ArrayList<CibilDto>();
		List<Cibil> list = (List<Cibil>) icm.findAll();
		System.out.println(list.toString());
		for (Cibil c : list) {
			CibilDto dto = modelMapper.map(c, CibilDto.class);
			list1.add(dto);
		}
		return list1;

	}

	@Override
	public EnquiryDto getEnquiryDetails(String leadNo) throws EnquiryDetailNotAvailableException {
		logger.info("in service getEnquiryDetails by leadNo");
		Enquiry lead = ienquiry.findByLeadNo(leadNo);

		if (lead != null) {
			EnquiryDto dto = modelMapper.map(lead, EnquiryDto.class);
			return dto;
		} else {
			logger.error("in custome exception getEnquiryDeatilsException");
			throw new EnquiryDetailNotAvailableException("EnquiryDetailNotAvailable");
		}
	}

	@Transactional
	@Override
	public void getApprovalRequest(int statusCode, int enquiryId) {
		logger.info("in service getApprovalRequest");
		// TODO Auto-generated method stub
		int i = ienquiry.approvedUpdateStatusCode(statusCode, enquiryId);
		System.out.println(i);
		Enquiry enquiry = new Enquiry();
		modelMapper.map(enquiry, EnquiryDto.class);
	}

	@Transactional
	@Override
	public void getPendingRequest(int statusCode, int enquiryId) {
		logger.info("in service getPendingRequest");
		// TODO Auto-generated method stub
		int i = ienquiry.pendingUpdateStatusCode(statusCode, enquiryId);
		System.out.println(i);
	}

}
