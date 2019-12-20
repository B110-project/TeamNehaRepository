import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AhdashComponent } from './ahdash/ahdash.component';
import { Routes, RouterModule } from '@angular/router';

const ahroute:Routes=[
  {path:'ahdash',component:AhdashComponent}
]

@NgModule({
  declarations: [AhdashComponent],
  imports: [
    CommonModule,RouterModule.forChild(ahroute)
  ]
})
export class AhmoduleModule { }
