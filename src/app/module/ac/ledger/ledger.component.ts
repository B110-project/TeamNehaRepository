import { Component, OnInit } from '@angular/core';
import { AcserviceService } from 'app/shared/acservice.service';
import { Ledger } from 'app/Model/ledger';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ledger',
  templateUrl: './ledger.component.html',
  styleUrls: ['./ledger.component.scss']
})
export class LedgerComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {

  }

  viewLedger() {
this.router.navigateByUrl('ac/view');
  }

  generateLedger() {
this.router.navigateByUrl('ac/generate');
  }
}
