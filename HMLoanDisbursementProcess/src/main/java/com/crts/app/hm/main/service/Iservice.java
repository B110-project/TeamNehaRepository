package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.LedgerDto;
import com.crts.app.hm.main.model.Disbursement;

public interface Iservice {

	public LedgerDto ledgerGeneration(LedgerDto ld);

	public List<LedgerDto> getData(String loanNo);

	public String disbursment(Disbursement d);

	public List<Disbursement> getDisburmentData();

}
