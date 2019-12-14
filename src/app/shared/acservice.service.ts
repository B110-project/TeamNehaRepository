import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Disbursment } from 'app/Model/disbursment';
import { LedgerDto } from 'app/Model/LedgerDto';


@Injectable({
  providedIn: 'root'
})
export class AcserviceService {

  apiurl = 'http://localhost:8083';

  constructor(private http: HttpClient) { }

  // getAllDetails() {
  //   return this.http.get(this.apiurl + '/' + 'getdata');
  // }
  getLedgerDetails(loanNo) {
    return this.http.get(this.apiurl + '/' + 'getdata/' + loanNo);
  }
  getDisbursmentInfo() {
    return this.http.get(this.apiurl + '/' + 'getDisbursment')
  }

  generateLedger(disb: Disbursment) {
    return this.http.post(this.apiurl + '/' + 'ledgerGenerate', disb);
  }

}
