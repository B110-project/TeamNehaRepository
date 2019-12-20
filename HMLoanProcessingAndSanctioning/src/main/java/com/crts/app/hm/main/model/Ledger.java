package com.crts.app.hm.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ledger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	// private Date emiPaidDate;
	private double closingAmount;
	private double interest;
	private double principal;

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

	public Date getEmiDueDate() {
		return emiDueDate;
	}

	public void setEmiDueDate(Date emiDueDate) {
		this.emiDueDate = emiDueDate;
	}

	/*
	 * public Date getEmiPaidDate() { return emiPaidDate; }
	 * 
	 * 
	 * public void setEmiPaidDate(Date emiPaidDate) { this.emiPaidDate =
	 * emiPaidDate; }
	 */

	public double getClosingAmount() {
		return closingAmount;
	}

	public void setClosingAmount(double closingAmount) {
		this.closingAmount = closingAmount;
	}

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

	@Override
	public String toString() {
		return "Ledger [ledgerId=" + ledgerId + ", loanAmount=" + loanAmount + ", rateOfInterest=" + rateOfInterest
				+ ", tenure=" + tenure + ", emiAmount=" + emiAmount + ", totalAmount=" + totalAmount + ", leadNo="
				+ leadNo + ", loanNo=" + loanNo + ", status=" + status + ", emiDueDate=" + emiDueDate
				+ ", closingAmount=" + closingAmount + ", interest=" + interest + ", principal=" + principal + "]";
	}

}
