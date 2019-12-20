package com.crts.app.hm.main.service;

import com.crts.app.hm.main.dto.EnquiryDto;
import com.crts.app.hm.main.dto.LoanDto;
import com.crts.app.hm.main.model.Loan;

public interface IOEService
{
	public Loan postLoanData(Loan loan);
	public Loan emiCalculate(Loan loan);
	public LoanDto postEmiData(LoanDto loanDto);
        public void generateCibilScore(EnquiryDto enq);
	public float getCibilScoreByLeadNo(String leadNo);

}
