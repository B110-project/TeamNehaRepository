import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LedgerComponent } from './ledger/ledger.component';
import { Router, Routes } from '@angular/router';
import { RouterModule } from '@angular/router';
import { AcdashComponent } from './acdash/acdash.component';
import { GetLedgerDataComponent } from './get-ledger-data/get-ledger-data.component';
import { GenerateLedgerComponent } from './generate-ledger/generate-ledger.component';
import { DisbursmentComponent } from './disbursment/disbursment.component';

const ledgerRouting: Routes = [
  { path: 'acdash', component: AcdashComponent },
  { path: 'ledger', component: LedgerComponent },
  { path: 'view', component: GetLedgerDataComponent },
  { path: 'generate', component: GenerateLedgerComponent },
  { path: 'disb', component: DisbursmentComponent }
]
@NgModule({
  declarations: [LedgerComponent, AcdashComponent, GetLedgerDataComponent, GenerateLedgerComponent, DisbursmentComponent],
  imports: [
    CommonModule, RouterModule.forChild(ledgerRouting)
  ]
})
export class AcModule { }
