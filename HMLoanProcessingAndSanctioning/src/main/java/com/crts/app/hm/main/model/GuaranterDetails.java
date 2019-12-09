package com.crts.app.hm.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class GuaranterDetails 
{
	@Id
	private int guarenterDetailsId;
	@OneToOne(cascade = CascadeType.ALL)
	private PersonalDetails guranterPersonal;
	@OneToOne(cascade = CascadeType.ALL)
	private FamilyDetails guranterFamily;
	@ElementCollection
	private List<PreviousLoanDetails> guranterPreviousLoans;
	private String guranterRelationToCustomer;
	@OneToOne(cascade = CascadeType.ALL)
	private DocumentDetails gurenterDocs;

	public int getGuarenterDetailsId() {
		return guarenterDetailsId;
	}

	public void setGuarenterDetailsId(int guarenterDetailsId) {
		this.guarenterDetailsId = guarenterDetailsId;
	}

	public PersonalDetails getGuranterPersonal() {
		return guranterPersonal;
	}

	public void setGuranterPersonal(PersonalDetails guranterPersonal) {
		this.guranterPersonal = guranterPersonal;
	}

	public FamilyDetails getGuranterFamily() {
		return guranterFamily;
	}

	public void setGuranterFamily(FamilyDetails guranterFamily) {
		this.guranterFamily = guranterFamily;
	}

	public List<PreviousLoanDetails> getGuranterPreviousLoans() {
		return guranterPreviousLoans;
	}

	public void setGuranterPreviousLoans(List<PreviousLoanDetails> guranterPreviousLoans) {
		this.guranterPreviousLoans = guranterPreviousLoans;
	}

	public String getGuranterRelationToCustomer() {
		return guranterRelationToCustomer;
	}

	public void setGuranterRelationToCustomer(String guranterRelationToCustomer) {
		this.guranterRelationToCustomer = guranterRelationToCustomer;
	}

	public DocumentDetails getGurenterDocs() {
		return gurenterDocs;
	}

	public void setGurenterDocs(DocumentDetails gurenterDocs) {
		this.gurenterDocs = gurenterDocs;
	}

	@Override
	public String toString() {
		return "GuaranterDetails [guarenterDetailsId=" + guarenterDetailsId + ", guranterPersonal=" + guranterPersonal
				+ ", guranterFamily=" + guranterFamily + ", guranterPreviousLoans=" + guranterPreviousLoans
				+ ", guranterRelationToCustomer=" + guranterRelationToCustomer + ", gurenterDocs=" + gurenterDocs + "]";
	}

}
