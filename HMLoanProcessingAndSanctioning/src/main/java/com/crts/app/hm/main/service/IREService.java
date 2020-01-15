package com.crts.app.hm.main.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.crts.app.hm.main.model.CustomerDetails;
import com.crts.app.hm.main.model.Loan;
import com.itextpdf.text.DocumentException;

public interface IREService {

	public CustomerDetails generateAcknowledgementLetter(int customerId) throws FileNotFoundException, DocumentException; 
	//public Letter uploadAcknowledgementLetter(MultipartFile file) throws IOException;
	
	public Loan getLoanByCustomerId(int customerId);
	
	public void storeFile(MultipartFile file) throws IOException ;

	public static Resource loadFile(String filename) 
	{
		
		return null;
	}
}
