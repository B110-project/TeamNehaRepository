import { Component, OnInit } from '@angular/core';
import { ShareService } from 'app/shared/share.service';
import { Enquiry } from 'app/model/Enquiry.module';

declare interface ApprovedList {
  headerRow: string[];
}

@Component({
  selector: 'app-approvedcibillist',
  templateUrl: './approvedcibillist.component.html',
  styleUrls: ['./approvedcibillist.component.scss']
})
export class ApprovedcibillistComponent implements OnInit {
  public approvedList: ApprovedList;
  alldata: Enquiry[];

  statusCode: Enquiry = {

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
    this.approvedList = {
      headerRow: ['EnquiryID', 'FirstName', 'MiddleName', 'LastName', 'PanNo',
        'AadhaarNo', 'MobileNo', 'EmailId', 'Gender', 'LeadNo',
        'StatusCode', 'BranchCode', 'LoanAmount', 'LoanType', 'EmploymentType',
        'Address', 'Salaried', 'Business'],
    };
    console.log(this.statusCode);
    this.ser.getstatuscode(105).subscribe(
      (data: Enquiry[]) => {
        this.alldata = data;
        console.log(data);
      }
    )
  }
}



