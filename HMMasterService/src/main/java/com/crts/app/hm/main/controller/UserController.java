package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.model.User;
import com.crts.app.hm.main.model.UserDetails;
import com.crts.app.hm.main.service.IService;

@RestController
public class UserController {

	@Autowired
	IService sf;
	
	@RequestMapping(value = "/getsingleuser")
	public UserDetails getSingleUser(@RequestBody UserDetails er)
	{
		UserDetails eru=sf.getUserDetail(er.getUserDetailsId());
		return eru;
	}
	@RequestMapping(value = "/getalluser")
	public List<UserDetails> getAllUser()
	{
		List<UserDetails> el=sf.getAllUserDetails();
		return el;
	}
	@RequestMapping(value = "/adduserdetails")
	public UserDetails addUser(@RequestBody UserDetails u)
	{
		UserDetails uu=sf.addUserDetails(u);
		return uu ;
	}
	@RequestMapping(value = "/edituserdetails")
	public UserDetails EditUserDetails(@RequestBody UserDetails u)
	{
		UserDetails ee=sf.EditUserDetails(u.getUserDetailsId());
		return ee;
	}
	
	@RequestMapping(value = "/updateuserdeatails")
	public List<UserDetails> updateUserDetails(@RequestBody UserDetails e)
	{
		List<UserDetails> el=sf.updateUserDetails(e);
		return el;
	}
	@RequestMapping(value = "/deleteuserdetails")
	public  void deleteUser(@RequestBody UserDetails e)
	{
		sf.deleteUserDetails(e.getUserDetailsId());
	}
	
	
	// User Mapping 
	
	@RequestMapping(value = "/getsingleuserad")
	public User getUser(@RequestBody User er)
	{
		User eru=sf.getUserl(er.getUserId());
		return eru;
	}
	@RequestMapping(value = "/getalluserad")
	public List<User> getAllUserAd()
	{
		List<User> el=sf.getAllUser();
		return el;
	}
	@RequestMapping(value = "/adduserdetailsad")
	public User addUserAd(@RequestBody User u)
	{
		User uu=sf.addUser(u);
		return uu ;
	}
	@RequestMapping(value = "/edituserdetailsad")
	public User EditUserDetailsAd(@RequestBody User u)
	{
		User ee=sf.editUser(u.getUserId());
		return ee;
	}
	
	@RequestMapping(value = "/updateuserdeatailsad")
	public List<User> updateUserDetailsAd(@RequestBody User e)
	{
		List<User> el=sf.updateUser(e);
		return el;
	}
	@RequestMapping(value = "/deleteuserdetailsad")
	public  void deleteUserAd(@RequestBody User e)
	{
		sf.deleteUser(e.getUserId());
	}

	

	
	

}
