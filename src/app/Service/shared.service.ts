import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Loan } from '../Model/model.Loan';
import { LoanComponent } from '../Components/loan/loan.component';
import { combineLatest } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SharedService {
  // tslint:disable-next-line: max-line-length
  loan: Loan = { loanId: null, loanAmount: null, rateOfInterest: null, tenure: null, marginAmount: null, emiAmount: null, processingFees: null, otherCharges: null, totalAmount: null, leadNo: '', loanNo: '', loanType: '', status: null };
  url = 'http://localhost:8082/';
  // tslint:disable-next-line: variable-name
  constructor(private http: HttpClient) { }


  calculateEmi(loan)
  {
    return this.http.post(this.url + 'emiCalculate', loan);
    
  }
  getEmiCalculation()
  {
    return this.http.get(this.url + 'emiCalculate');

  }
  postEmiData(loandto)
    {
      return this.http.post(this.url +'postEmiData', loandto);
    }
}
