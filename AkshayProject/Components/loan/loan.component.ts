import { Component, OnInit } from '@angular/core';
import { SharedService } from 'src/app/Service/shared.service';
import { Loan } from 'src/app/Model/model.Loan';
import { Loandto } from 'src/app/Model/model.Loandto';

@Component({
  selector: 'app-loan',
  templateUrl: './loan.component.html',
  styleUrls: ['./loan.component.css']
})
export class LoanComponent implements OnInit {
  // tslint:disable-next-line: max-line-length
  loan: Loan = { loanId: null, loanAmount: null, rateOfInterest: null, tenure: null, marginAmount: null, emiAmount: null, processingFees: null, otherCharges: null, totalAmount: null, leadNo: '', loanNo: '', loanType: '', status: null };
  alldata: Loan[];
  constructor(private ser: SharedService) { }
  // tslint:disable-next-line: max-line-length
  loandto: Loandto = { loanIddto: null, loanAmountdto: null, rateOfInterestdto: null, tenuredto: null, marginAmountdto: null, emiAmountdto: null, processingFeesdto: null, otherChargesdto: null, totalAmountdto: null, leadNodto: '', loanNodto: '', loanTypedto: '', statusdto: null,CustomerDetailsdto:'' };
  ngOnInit() {
  }
  calculateEmi(loan) {
    this.ser.calculateEmi(loan).subscribe(
      (data: Loandto) => {
    //    this.alldata = data;
        this.loandto=data;
        console.log(this.alldata);


      }
    );
    
  }
  postEmiData(loandto)
    {
      this.ser.postEmiData(loandto).subscribe(
        (data : Loandto)=>
        {
          this.loandto=data;
          console.log(this.loandto);
          
        }
      );

    }


}