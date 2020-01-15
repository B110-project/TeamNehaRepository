package com.crts.app.hm.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cibil {
	@Id

	private int cibilId;
	private float cibilScore;
	private int cibilStatus;
	private String leadNo;

	public int getCibilStatus() {
		return cibilStatus;
	}

	public void setCibilStatus(int cibilStatus) {
		this.cibilStatus = cibilStatus;
	}

	public int getCibilId() {
		return cibilId;
	}

	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}

	public float getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(float cibilScore) {
		this.cibilScore = cibilScore;
	}

	public String getLeadNo() {
		return leadNo;
	}

	public void setLeadNo(String leadNo) {
		this.leadNo = leadNo;
	}

	@Override
	public String toString() {
		return "Cibil [cibilId=" + cibilId + ", cibilScore=" + cibilScore + ", cibilStatus=" + cibilStatus + ", leadNo="
				+ leadNo + "]";
	}

}
