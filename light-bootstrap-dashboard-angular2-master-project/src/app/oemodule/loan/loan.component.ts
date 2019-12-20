import { Component, OnInit } from '@angular/core';
import { Loan } from 'app/model/Loan.module';
import { CustomerDetails } from 'app/model/CustomerDetails.model';
import { ShareService } from 'app/shared/share.service';

@Component({
  selector: 'app-loan',
  templateUrl: './loan.component.html',
  styleUrls: ['./loan.component.scss']
})
export class LoanComponent implements OnInit {
  loan: Loan = {

    loanId: null,
    loanAmount: null,
    rateOfInterest: null,
    tenure: null,
    marginAmount: null,
    emiAmount: null,
    processingFees: null,
    otherCharges: null,
    totalAmount: null,
    leadNo: null,
    loanNo: '',
    loanType: '',
    status: null,
    customerDetails: null
  }
  constructor(private ser: ShareService) { }

  ngOnInit() {
  }
  submit(loan: Loan) {
    console.log(loan);
    this.ser.getloan(loan).subscribe(
      (data) => {
        console.log(data);
      }
    )
  }

}
