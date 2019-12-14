import { Component, OnInit } from '@angular/core';
import { LedgerDto } from 'app/Model/LedgerDto';
import { AcserviceService } from 'app/shared/acservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-ledger-data',
  templateUrl: './get-ledger-data.component.html',
  styleUrls: ['./get-ledger-data.component.scss']
})
export class GetLedgerDataComponent implements OnInit {
  allData: LedgerDto[];
  l: LedgerDto = {
    ledgerId: null,
    loanAmount: null,
    rateOfInterest: null,
    tenure: null,
    emiAmount: null,
    totalAmount: null,
    leadNo: null,
    loanNo: null,
    status: null,
    emiDueDate: null,
    closingAmount: null,
    interest: null,
    principal: null
  }
  constructor(private ser: AcserviceService, private router: Router) { }

  ngOnInit() {
    // this.ser.postLoanDetails().subscribe(
    //   (data: LedgerDto[]) => {
    //     this.allData = data;
    //     console.log(data);
    // this.router.navigateByUrl('ac/ledger');
    // }
    // );


    this.allData = JSON.parse(sessionStorage.getItem('data'));
    console.log(this.allData);
  }

}
