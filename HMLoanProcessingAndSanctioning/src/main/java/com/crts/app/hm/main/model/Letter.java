package com.crts.app.hm.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Letter {

	@Id
	private int letterId;
	private String confirmationLetter;
	private String acknowledgementLetter;
	private String sanctionLetter;
	@OneToOne(cascade = CascadeType.ALL)
	private Loan leadNo;
	
	/*
	 * private String acLetter; private String acLetterType;
	 * 
	 * @Lob private byte[] data;
	 * 
	 * public Letter(String acLetter, String acLetterType, byte[] data) { super();
	 * this.acLetter = acLetter; this.acLetterType = acLetterType; this.data = data;
	 * }
	 
	public String getAcLetter() {
		return acLetter;
	}
	public void setAcLetter(String acLetter) {
		this.acLetter = acLetter;
	}
	public String getAcLetterType() {
		return acLetterType;
	}
	public void setAcLetterType(String acLetterType) {
		this.acLetterType = acLetterType;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	*/
	
	public int getLetterId() {
		return letterId;
	}
	public void setLetterId(int letterId) {
		this.letterId = letterId;
	}
	public String getConfirmationLetter() {
		return confirmationLetter;
	}
	public void setConfirmationLetter(String confirmationLetter) {
		this.confirmationLetter = confirmationLetter;
	}
	public String getAcknowledgementLetter() {
		return acknowledgementLetter;
	}
	public void setAcknowledgementLetter(String acknowledgementLetter) {
		this.acknowledgementLetter = acknowledgementLetter;
	}
	public String getSanctionLetter() {
		return sanctionLetter;
	}
	public void setSanctionLetter(String sanctionLetter) {
		this.sanctionLetter = sanctionLetter;
	}
	public Loan getLeadNo() {
		return leadNo;
	}
	public void setLeadNo(Loan leadNo) {
		this.leadNo = leadNo;
	}
	
	
}
