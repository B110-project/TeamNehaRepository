package com.crts.app.hm.main.service;

import java.util.List;


import com.crts.app.hm.main.dto.BranchAllDto;
import com.crts.app.hm.main.dto.BranchIdDto;
import com.crts.app.hm.main.dto.BranchNameDto;
import com.crts.app.hm.main.model.Branch;
import com.crts.app.hm.main.model.User;
import com.crts.app.hm.main.model.UserDetails;

public interface IService {

	public BranchAllDto getBranchById(int id);
	public BranchAllDto getBranchByName(String branchName);
	public List<BranchAllDto> getBranchAll();
	public BranchAllDto edit(int branchId);
	public void deleteBranch(int branchId);
	public Branch saveBranch(Branch br);
	
	//user Details Methods 
	
public UserDetails getUserDetail(int id);
	
	public List<UserDetails> getAllUserDetails();
	
	public UserDetails addUserDetails(UserDetails u);
	
	public UserDetails EditUserDetails(int id);
	
	public  void deleteUserDetails(int Id);

	
	public List<UserDetails> updateUserDetails(UserDetails u);
	
	//User Methods
	
public User getUserl(int id);
	
	public List<User> getAllUser();
	
	public User addUser(User u);
	
	public User editUser(int id);
	
	public  void deleteUser(int Id);

	
	public List<User> updateUser(User u);
	
	
	
	
	
}
