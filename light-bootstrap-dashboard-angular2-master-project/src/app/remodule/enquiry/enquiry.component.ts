import { Component, OnInit } from '@angular/core';
import { ShareService } from 'app/shared/share.service';
import { Enquiry } from 'app/model/Enquiry.module';
import { SalariedDetails } from 'app/model/SalariedDetails.module';
import { BusinessDetails } from 'app/model/BusinessDetails.module';
import { Address } from 'app/model/Address.module';

@Component({
  selector: 'app-enquiry',
  templateUrl: './enquiry.component.html',
  styleUrls: ['./enquiry.component.scss']
})
export class EnquiryComponent implements OnInit {
  enquiry: Enquiry = {

    enquiryId: null,
    firstName: '',
    middleName: '',
    lastName: '',
    panNo: '',
    aadharNo: '',
    mobileNo: '',
    emailId: '',
    gender: '',
    leadNo: '',
    statusCode: null,
    branchCode: '',
    loanAmount: null,
    loanType: '',
    employmentType: '',
    address: null,
    salaried: null,
    business: null,
  }

  constructor(private ser: ShareService) { }
  ngOnInit() {
  }
  submit(enquiry: Enquiry) {
    console.log(enquiry);
    this.ser.submit(enquiry).subscribe(
      (data) => {
        console.log(data);

      }

    )

  }
}
