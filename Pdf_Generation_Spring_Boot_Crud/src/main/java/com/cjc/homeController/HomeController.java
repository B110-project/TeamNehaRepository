package com.cjc.homeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.Service.HomeService;
import com.cjc.model.Student;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;
	
	
	@RequestMapping(value="/")
	public String preloging()
	{
		return "Login";
		
	}
	@RequestMapping(value="/reg1")
	public String preregister()
	{
		return "Register";
		
	}
	
	@RequestMapping(value="/pdfgen")
	public String pdfgeneration()
	{
		hs.generatepdf();
		return "Login";
		
	}
	
	@RequestMapping(value="/reg2")
	public String registerpage(@ModelAttribute("stu") Student s)
	{
		
		System.out.println(s.getUi());
		Student i=hs.savadetail(s);
		if(i!=null){
		return "Login";
		}
		else {
			return "Register";
		}
	}

	
	@RequestMapping(value="/log")
	public String logincheck(@RequestParam("una") String uname , @RequestParam("upas") String password , Model m){
		
		List<Student> sl=hs.getDetails(uname,password);
		
		m.addAttribute("list",sl);
		
		return "Success";
		
		
	
	
}
	
@RequestMapping(value="/adl")
	
	public String displayaddpage()
	{
		return "Register";
	}
	
@RequestMapping(value="/edt")
	
	public String edit(@RequestParam("rid") Integer radio,Model m)
	{
		int n=radio;
		Student s=(Student) hs.editdetails(n);
		m.addAttribute("data",s);
		return "Edit";
	}
	
	@RequestMapping(value="edit")
	public String update(@ModelAttribute("stu") Student s,Model m)
	{
		System.out.println(s.getUi());
		List<Student> sl=hs.updatedetails(s);
		m.addAttribute("list",sl);
		
		return "Success";
	}
	
	@RequestMapping(value="/dl")
	public String delete(@RequestParam("rid") Integer radio,Model m)
	{
		
		int n=radio;
		
		List<Student> sl=hs.delete(n);
		m.addAttribute("list",sl);
		return "Success";
	}
	@RequestMapping(value="/logout")
	public String logoutpage()
	{
		return "Login";
		
	}
}