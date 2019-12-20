import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdmindashComponent } from './admindash/admindash.component';
import { Routes, RouterModule } from '@angular/router';

const adminroute: Routes = [
  { path: 'admindash', component: AdmindashComponent }
]

@NgModule({
  declarations: [AdmindashComponent],
  imports: [
    CommonModule, RouterModule.forChild(adminroute)
  ]
})
export class AdminModule { }
