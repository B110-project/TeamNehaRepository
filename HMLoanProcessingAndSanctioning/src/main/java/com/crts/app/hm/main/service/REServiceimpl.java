package com.crts.app.hm.main.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import com.crts.app.hm.main.model.Loan;
import com.crts.app.hm.main.repository.ICustomerDetailsRepository;
import com.crts.app.hm.main.repository.ILoanRepository;
import com.crts.app.hm.main.model.CustomerDetails;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.util.FileSystemUtils;

@Service
public  class REServiceimpl implements IREService
{

	 @Autowired
	 ICustomerDetailsRepository cdrepo;
	 
	 @Autowired
	 ILoanRepository lorepo;
	
	 Logger log = LoggerFactory.getLogger(this.getClass().getName());
	 
	 private final Path rootLocation = Paths.get("D://REAcknowledge Letter");

		public void store(MultipartFile file)
		{
			try 
			{
				Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));
			} 
			catch (Exception e)
			{
				throw new RuntimeException("FAIL!");
			}
		}
	  
	 @Override
		public CustomerDetails generateAcknowledgementLetter(int customerId) throws FileNotFoundException, DocumentException
	 {
       CustomerDetails cd=cdrepo.findById(customerId).get();
       
       Loan lo = this.getLoanByCustomerId(customerId);
 
		
		String filename ="D:/REAcknowledge Letter/Finance.pdf";
		Document doc = new Document();
		PdfWriter.getInstance(doc, new FileOutputStream(filename));
		doc.open();

		Font f = new Font();
		f.setStyle(Font.BOLD);
		f.setSize(18);

		
		Font f1 = new Font();
		f1.setStyle(Font.BOLD);
		
		Paragraph p = new Paragraph("Acknowledgement Letter", f);
		p.setAlignment(Element.ALIGN_CENTER);
		doc.add(p);

		Paragraph p1 = new Paragraph("\n"+cd.getCustomerPersonal().getFirstName() +" " + cd.getCustomerPersonal().getLastName()+"\n"+
		cd.getCustomerPersonal().getCustomerAddress().getArea()+"\n"+cd.getCustomerPersonal().getCustomerAddress().getCity()+"\n"+
		cd.getCustomerPersonal().getCustomerAddress().getState()+"\n"+cd.getCustomerPersonal().getCustomerAddress().getPincode(),f1); 
		doc.add(p1); 
		 
	
		
		Paragraph p3 = new Paragraph("\n"+"Subject:Acknowledgement of payment Letter",f1);
		doc.add(p3);


		Paragraph p4 = new Paragraph("\n"+"Dear "+cd.getCustomerPersonal().getFirstName(),f1);
		
		doc.add(p4);
		 
		Paragraph p5 = new Paragraph("\n"+"We are very glad to inform you that in reponse to your request for a bank loan in order to meet your tight"
		+ " financial problem, We have approved your request. you requested a short-term loan of "+lo.getLoanAmount()+" rs."
		+ " We wanted to meet your expenses. Hence, the bank has decided to approve your application of loan for "+lo.getLoanAmount()+" rs." +"\n");
		doc.add(p5);
	
		Paragraph p6= new Paragraph("\n"+"With this letter we hereby acknowledge receipt of your payment of "+lo.getLoanAmount()+" rs. paid amount"
		+ " will be credited to your account. Your credit card is fully functional again. All of your spending privilleges have been resumed."+"\n");
		doc.add(p6);
		
		Paragraph p10 = new Paragraph("\n"+"The interest rate that you will have to pay on the loan will be " +lo.getRateOfInterest()+  " %."
	    + " This interest has been calculated with the help of standard formula. As discussed earlier, you will have to pay the loan bank within "
        + lo.getTenure()+ " year. Moreover, the rate may change depening on the duration of loan you choose. your Emi Amount will be "+lo.getEmiAmount()+" rs."+"\n");
		doc.add(p10);

		Paragraph p16 = new Paragraph();
		p16.add("\n"+"yours Sincerely,");
		doc.add(p16);

		doc.close();
		
		return cd;
	}
 
	@Override
	public Loan getLoanByCustomerId(int customerId) 
	{
		Loan loan = lorepo.findByCustomerDetails_customerId(customerId);
		return loan;
	}
	
	  private static final String FILE_DIRECTORY = "D://REAcknowledge Letter";
	  
	  @Override
		public void storeFile(MultipartFile file) throws IOException
	  {
			 Path filePath = Paths.get(FILE_DIRECTORY + "/" + file.getOriginalFilename());
			  
			  Files.copy(file.getInputStream(), filePath,
			 StandardCopyOption.REPLACE_EXISTING);		
		}  
	 
	  

			public Resource loadFile(String filename) 
			{
				try 
				{
					Path file = rootLocation.resolve(filename);
					Resource resource = new UrlResource(file.toUri());
					if (resource.exists() || resource.isReadable()) 
					{
						return resource;
					} 
					else
					{
						throw new RuntimeException("FAIL!");
					}
				}
				catch (MalformedURLException e) 
				{
					throw new RuntimeException("FAIL!");
				}
			}

			public void deleteAll()
			{
				FileSystemUtils.deleteRecursively(rootLocation.toFile());
			}

			public void init() 
			{
				try
				{
					Files.createDirectory(rootLocation);
				} 
				catch (IOException e) 
				{
					throw new RuntimeException("Could not initialize storage!");
				}
			}
}

