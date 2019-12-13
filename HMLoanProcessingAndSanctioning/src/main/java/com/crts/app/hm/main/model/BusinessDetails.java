package com.crts.app.hm.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class BusinessDetails 
{
	@Id
	private int businessDetailsId;
	private double annualIncome;
	private String firmName;
	private double otherIncome;
	private String registrationNo;
	private String firmType;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	@NotFound(action = NotFoundAction.IGNORE)
	@LazyToOne(LazyToOneOption.NO_PROXY)
	private Address firmAddress;
	
	
	public int getBusinessDetailsId() {
		return businessDetailsId;
	}
	public void setBusinessDetailsId(int businessDetailsId) {
		this.businessDetailsId = businessDetailsId;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public double getOtherIncome() {
		return otherIncome;
	}
	public void setOtherIncome(double otherIncome) {
		this.otherIncome = otherIncome;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getFirmType() {
		return firmType;
	}
	public void setFirmType(String firmType) {
		this.firmType = firmType;
	}
	public Address getFirmAddress() {
		return firmAddress;
	}
	public void setFirmAddress(Address firmAddress) {
		this.firmAddress = firmAddress;
	}
	@Override
	public String toString() {
		return "BusinessDetails [businessDetailsId=" + businessDetailsId + ", annualIncome=" + annualIncome
				+ ", firmName=" + firmName + ", otherIncome=" + otherIncome + ", registrationNo=" + registrationNo
				+ ", firmType=" + firmType + ", firmAddress=" + firmAddress + "]";
	}
	
	
	
}
