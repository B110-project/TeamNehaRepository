import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BmdashComponent } from './bmdash/bmdash.component';
import { Routes, RouterModule } from '@angular/router';

const bmroute:Routes=[
  {path:'bmdash',component:BmdashComponent}
]


@NgModule({
  declarations: [BmdashComponent],
  imports: [
    CommonModule,RouterModule.forChild(bmroute)
  ]
})
export class BmmoduleModule { }
