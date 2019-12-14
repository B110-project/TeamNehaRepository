package com.cjc.ServiceImpl;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.cjc.Service.HomeService;
import com.cjc.homeRepository.HomeRepository;
import com.cjc.model.Student;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	
	@Override
	public Student savadetail(Student s) {
		return hr.save(s);
		
	}

	@Override
	public List<Student> getDetails(String uname, String password)
	{
		if(uname.equals("admin")&&password.equals("admin"))
		{
			return (List<Student>) hr.findAll();
		}
		else
		{
		return hr.findAllByUnaAndUpas(uname, password);
		}

	}

	@Override
	public Student editdetails(int n) {
		return hr.findById(n).get();
	}

	@Override
	public List<Student> updatedetails(Student s) 
	{
	
		hr.save(s);
		return (List<Student>) hr.findAll();
		
	}

	@Override
	public List<Student> delete(int n) {
		
		 hr.deleteById(n);
		 return (List<Student>) hr.findAll();
		
	}

	@Override
	public void generatepdf() {
		List<Student>s=(List<Student>) hr.findAll();
		try
		{
		String filename="D:\\Education\\student.pdf";
		Document document=new Document();
		PdfWriter.getInstance(document, new FileOutputStream(filename));
		document.open();
		
		for(Student stu:s)
		{
			Paragraph para=new Paragraph(stu.getUi()+"  "+stu.getName()+"  "+stu.getAddr()+"  "+stu.getEmail()+"  "+stu.getUna()+"  "+stu.getUpas());
			    System.out.println("in pdf function "+stu.getName());
				document.add(para);
				document.add(new Paragraph("  "));
			
		}
		
		document.close();
		
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
	}

	
	
	
}
