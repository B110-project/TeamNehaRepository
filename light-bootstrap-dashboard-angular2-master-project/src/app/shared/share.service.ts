import { Injectable } from '@angular/core';
import { User } from 'app/model/User.module';
import { HttpClient } from '@angular/common/http';
import { Enquiry } from 'app/model/Enquiry.module';
import { Loan } from 'app/model/Loan.module';
import { StatusMaster } from 'app/model/StatusMaster.module';

@Injectable({
  providedIn: 'root'
})
export class ShareService {

  us: User = {

    userId: null,
    username: '',
    password: '',
    branchcode: '',
    userRole: null
  }
  mockurl = 'http://localhost:8082';
  constructor(private http: HttpClient) { }

  signinuser(us: User) {
    console.log(us);
    return this.http.post(this.mockurl + '/' + 'getAlldata/', us)
  }

  submit(enq: Enquiry) {
    console.log(enq);
    return this.http.post(this.mockurl + '/' + 'enquire/', enq)
  }
  getloan(lo: Loan) {
    console.log(lo);
    return this.http.post(this.mockurl + '/' + 'emiCalculate', lo)
  }
  getstatuscode(statusCode) {
    console.log(statusCode);
    return this.http.get(this.mockurl + '/' + 'getEnquiryDetailsByStatusCode' + '/' + statusCode)
  }
}
