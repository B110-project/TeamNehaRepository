import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RedashComponent } from './redash/redash.component';
import { EnquiryComponent } from './enquiry/enquiry.component';
import { CustomerdetailsComponent } from './customerdetails/customerdetails.component';
import { Routes, RouterModule } from '@angular/router';

const reroutes: Routes = [
  { path: 'enquire', component: EnquiryComponent },
  { path: 'customer', component: CustomerdetailsComponent },
  { path: 'redash', component: RedashComponent }
]



@NgModule({
  declarations: [RedashComponent, EnquiryComponent, CustomerdetailsComponent],
  imports: [
    CommonModule, FormsModule, RouterModule.forChild(reroutes)
  ]
})
export class REmoduleModule { }
