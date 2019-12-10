package com.crts.app.hm.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StatusMaster {
	@Id
	private int statusId;
	private String statusName;
	private int statusCode;
	
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	

}
