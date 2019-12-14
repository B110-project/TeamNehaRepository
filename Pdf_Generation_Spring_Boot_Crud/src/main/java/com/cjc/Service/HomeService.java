package com.cjc.Service;

import java.util.List;

import org.springframework.ui.Model;

import com.cjc.model.Student;

public interface HomeService {

	public Student savadetail(Student s);

	public List<Student> getDetails(String uname, String password);

	public Student editdetails(int n);

	public List<Student> updatedetails(Student s);

	public List<Student> delete(int n);
	
	public void generatepdf();


	

	
	

	

}
