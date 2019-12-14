import { Component, OnInit } from '@angular/core';
import { AcserviceService } from 'app/shared/acservice.service';
import { Disbursment } from 'app/Model/disbursment';
import { LedgerDto } from 'app/Model/LedgerDto';
import { Router } from '@angular/router';

@Component({
  selector: 'app-disbursment',
  templateUrl: './disbursment.component.html',
  styleUrls: ['./disbursment.component.scss']
})
export class DisbursmentComponent implements OnInit {

  allData: Disbursment[];
  disb: Disbursment = {
    disbId: null,
    name: '',
    address: '',
    loanNo: '',
    leadNo: '',
    loanAmount: null,
    rateOfInterest: null,
    tenure: null,
    emi: null,
    status: null
  }
  alldata: LedgerDto[];
  constructor(private acService: AcserviceService, private router: Router) { }
  ngOnInit() {
    this.acService.getDisbursmentInfo().subscribe(
      (data: Disbursment[]) => {
        this.allData = data;
        console.log(this.allData);

      }
    )
  }

  generateLedger(disb: Disbursment) {
    this.acService.generateLedger(disb).subscribe(
      (data: LedgerDto) => {
        // alert('Success:)\n\n',JSON.parse(data,null,4));
        console.log(data);
      }
    )
  }


  viewLedger(loanNo) {
    this.acService.getLedgerDetails(loanNo).subscribe(
      (data) => {
        // alert('Success:)\n\n',JSON.parse(data,null,4));
        sessionStorage.setItem('data', JSON.stringify(data));
        this.router.navigateByUrl('ac/view');
        console.log(data);
      }
    )
  }

}
