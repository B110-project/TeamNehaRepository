package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.CibilDto;
import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.model.Cibil;
import com.crts.app.hm.main.model.Enquiry;
import com.crts.app.hm.main.model.StatusMaster;
import com.crts.app.hm.main.repository.ICreditManagerRepository;
import com.crts.app.hm.main.repository.IEnquiryRepository;
import com.crts.app.hm.main.repository.IStatusMasterRepository;

@Service
public class ICMServiceImpl implements ICMService {

	@Autowired
	ICreditManagerRepository icm;

	@Autowired
	IStatusMasterRepository istatusMaster;

	@Autowired
	IEnquiryRepository ienquiry;

	ModelMapper m=new ModelMapper();

	public List<Enquiry> enquiryDeatils() {

		ienquiry.findAll();
		return null;

	}

	@Override
	public List<CibilDto> getAllCibilScore() {

		List<CibilDto> list1=new ArrayList<CibilDto>();
		List<Cibil> list = (List<Cibil>) icm.findAll();
		System.out.println(list.toString());
		for(Cibil c:list) {
			CibilDto dto=m.map(c, CibilDto.class);
			list1.add(dto);
		}
		return list1;
	}

	@Override
	public List<StatusMasterDto> getStatusCode() {
		// TODO Auto-generated method stub
		List<StatusMasterDto> listdto=new ArrayList<StatusMasterDto>();
		List<StatusMaster> list=(List<StatusMaster>) istatusMaster.findAll();
		System.out.println(list.toString());
		for(StatusMaster l:list) {
			System.out.println(l.getStatusName());
			System.out.println(l.getStatusCode());
			StatusMasterDto dto=m.map(l, StatusMasterDto.class);
			listdto.add(dto);

		}

		return listdto;


	}

	@Override
	public EnquiryDto getEnquiryDetails(String leadNo) {
		Enquiry lead=ienquiry.findByLeadNo(leadNo);
		EnquiryDto dto=m.map(lead, EnquiryDto.class);
		return dto;
	}

	@Transactional
	@Override
	public EnquiryDto getApprovalRequest(int statusCode,int enquiryId) {
		// TODO Auto-generated method stub
		 int i=ienquiry.updateStatusCode(statusCode, enquiryId);
		System.out.println(i);
		Enquiry enquiry=new Enquiry();
		 EnquiryDto dto=m.map(enquiry, EnquiryDto.class);
		return dto;
	}



}