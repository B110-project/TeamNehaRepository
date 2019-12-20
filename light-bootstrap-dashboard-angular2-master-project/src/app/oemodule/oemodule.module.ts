import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OedashComponent } from './oedash/oedash.component';
import { Routes, RouterModule } from '@angular/router';
import { LoanComponent } from './loan/loan.component';
import { FormsModule } from '@angular/forms';
import { ApprovedcibillistComponent } from './approvedcibillist/approvedcibillist.component';

const oeroute: Routes = [
  { path: 'loan', component: LoanComponent },
  { path: 'oedash', component: OedashComponent },
  { path: 'approvedcibillist', component: ApprovedcibillistComponent}
]


@NgModule({
  declarations: [OedashComponent, LoanComponent, ApprovedcibillistComponent],
  imports: [
    CommonModule, FormsModule, RouterModule.forChild(oeroute)
  ]
})
export class OemoduleModule { }
