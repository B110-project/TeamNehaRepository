package com.crts.app.hm.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	private int loanAmount;
	private float rateOfInterest;
	private int tenure;
	private double marginAmount;
	private double emiAmount;
	private double processingFees;
	private float otherCharges;
	private double totalAmount;
	private String leadNo;
	private String loanNo;
	private String loanType;
	private int status;

	/*
	 * @OneToOne private CustomerDetails customerDetails;
	 */
	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
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

	public double getMarginAmount() {
		return marginAmount;
	}

	public void setMarginAmount(double marginAmount) {
		this.marginAmount = marginAmount;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public double getProcessingFees() {
		return processingFees;
	}

	public void setProcessingFees(double processingFees) {
		this.processingFees = processingFees;
	}

	public float getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(float otherCharges) {
		this.otherCharges = otherCharges;
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

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
//	public CustomerDetails getCustomerDetails() {
//		return customerDetails;
//	}
//	public void setCustomerDetails(CustomerDetails customerDetails) {
//		this.customerDetails = customerDetails;
//	}
	
	  @Override public String toString() { return "Loan [loanId=" + loanId +
	  ", loanAmount=" + loanAmount + ", rateOfInterest=" + rateOfInterest +
	  ", tenure=" + tenure + ", marginAmount=" + marginAmount + ", emiAmount=" +
	  emiAmount + ", processingFees=" + processingFees + ", otherCharges=" +
	  otherCharges + ", totalAmount=" + totalAmount + ", leadNo=" + leadNo +
	  ", loanNo=" + loanNo + ", loanType=" + loanType + ", status=" + status +
	   "]"; }
	  
	  //", customerDetails=" + customerDetails +
	 
}
