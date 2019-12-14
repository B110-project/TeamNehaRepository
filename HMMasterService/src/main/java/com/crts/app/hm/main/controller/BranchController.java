package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.BranchAllDto;
import com.crts.app.hm.main.dto.BranchIdDto;
import com.crts.app.hm.main.dto.BranchNameDto;
import com.crts.app.hm.main.model.Branch;
import com.crts.app.hm.main.service.IService;

@RestController
public class BranchController {

	@Autowired
	IService ser;

	@RequestMapping(value = "/getBranchById/{branchId}", method = RequestMethod.GET)
	public BranchAllDto getBranchById(@PathVariable int branchId) {
		BranchAllDto branchdto = ser.getBranchById(branchId);
		return branchdto;
	}

	@RequestMapping("/getBranchByName/{branchName}")
	public BranchAllDto getBranchByName(@PathVariable String branchName) {
		BranchAllDto bnd = ser.getBranchByName(branchName);
		return bnd;
	}

	@RequestMapping("/getBranchDetails")
	public List<BranchAllDto> getAllBranch() {
		List<BranchAllDto> bad1 = ser.getBranchAll();
		return bad1;
	}

	@RequestMapping(value = "/edit/{branchId}")
	public BranchAllDto editBranch(@PathVariable int branchId) {
		BranchAllDto bad2 = ser.edit(branchId);
		return bad2;
	}

	@RequestMapping(value = "/deleteBranch/{branchId}")
	public String deleteBranch(@PathVariable int branchId) {
		ser.deleteBranch(branchId);
		return "your branch is deleted successfully";

	}

	@RequestMapping("/registerBranch")
	public Branch saveBranch(@RequestBody Branch br) {
		Branch branch = ser.saveBranch(br);
		return branch;
	}

	@RequestMapping("/updateBranch")
	public Branch updateBranch(@RequestBody Branch br) {
		Branch branch = ser.saveBranch(br);
		return branch;
	}

}
