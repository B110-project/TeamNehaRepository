package com.crts.app.hm.main.service;

import com.crts.app.hm.main.dto.LoanDto;
import com.crts.app.hm.main.model.Loan;

public interface Iservice
{
	public Loan postLoanData(Loan loan);
	public Loan emiCalculate(Loan loan);
	public LoanDto postEmiData(LoanDto loanDto);

}
