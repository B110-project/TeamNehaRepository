package com.crts.app.hm.main.service;

import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.model.Cibil;
import com.crts.app.hm.main.model.Enquiry;
import com.crts.app.hm.main.repository.ICibilRepository;

@Service
public class OEServiceImpl implements  IOEService{

	@Autowired
	ICibilRepository repo;
	
	

	@Override
	public void generateCibilScore(EnquiryDto enq) {
		
		Random rand = new Random();

		// nextInt as provided by Random is exclusive of the top value so you need to add 1 

		float cibilScore = rand.nextInt((900 - 500) + 1) + 500;
		
		Cibil c=new Cibil();
		c.setCibilScore(cibilScore);
		c.setLeadNo(enq.getLeadNo());
		c.setCibilStatus(0);
		
		ModelMapper mm=new ModelMapper();
		Cibil c1=mm.map(c,Cibil.class);
		 repo.save(c1);
		
	}



	@Override
	public float getCibilScoreByLeadNo(String leadNo) {
		
	return	repo.findCibilScoreByLeadNo(leadNo);
		
	}

}
