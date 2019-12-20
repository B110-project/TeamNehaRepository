package com.crts.app.hm.main.dto;

import java.util.Calendar;
import java.util.Date;

public class LedgerDto {

	private int ledgerId;
	private double loanAmount;
	private float rateOfInterest;
	private int tenure;
	private double emiAmount;
	private double totalAmount;
	private String leadNo;
	private String loanNo;
	private int status;
	private Date emiDueDate;
	//private Date emiPaidDate;
	private double closingAmount;
	private double interest;
	private double principal;
	
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getLeadNo() {
		return leadNo;
	}
	public void setLeadNo(String leadNo) {
		this.leadNo = leadNo;
	}
	public Date getEmiDueDate() {
		return emiDueDate;
	}
	public void setEmiDueDate(Date emiDueDate) {
		this.emiDueDate = emiDueDate;
	}
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

	/*
	 * public Date getEmiPaidDate() { return emiPaidDate; } public void
	 * setEmiPaidDate(Date emiPaidDate) { this.emiPaidDate = emiPaidDate; }
	 */
	public double getClosingAmount() {
		return closingAmount;
	}
	
	public void setClosingAmount(double closingAmount) {
		this.closingAmount = closingAmount;
	}
	
	
	
}
