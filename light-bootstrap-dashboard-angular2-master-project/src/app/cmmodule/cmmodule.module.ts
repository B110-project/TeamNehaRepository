import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CmdashComponent } from './cmdash/cmdash.component';
import { Routes, RouterModule } from '@angular/router';

const cmroute:Routes=[
  {path:'cmdash',component:CmdashComponent}
]


@NgModule({
  declarations: [CmdashComponent],
  imports: [
    CommonModule,RouterModule.forChild(cmroute)
  ]
})
export class CmmoduleModule { }
