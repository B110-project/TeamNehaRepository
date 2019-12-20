import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { LoginComponent } from './login/login.component';
import { REmoduleModule } from './remodule/remodule.module';
import { OemoduleModule } from './oemodule/oemodule.module';
import { CmmoduleModule } from './cmmodule/cmmodule.module';
import { BmmoduleModule } from './bmmodule/bmmodule.module';
import { AhmoduleModule } from './ahmodule/ahmodule.module';
import { AdminModule } from './admin/admin.module';

const routes: Routes = [
  { path: '', component: LoginComponent },
  //  { path: "", redirectTo: "dashboard", pathMatch: "full" },
  {
    path: 'role', component: AdminLayoutComponent,
    children: [
      { path: 're', loadChildren: () => REmoduleModule },
      { path: 'oe', loadChildren: () => OemoduleModule },
      { path: 'cm', loadChildren: () => CmmoduleModule },
      { path: 'bm', loadChildren: () => BmmoduleModule },
      { path: 'ah', loadChildren: () => AhmoduleModule },
      { path: 'admin', loadChildren: () => AdminModule }


      // {
      //   path: "",
      //   loadChildren:
      //     () => import('./layouts/admin-layout/admin-layout.module').then(m => m.AdminLayoutModule)
      // }
    ]
  },
  { path: '**', redirectTo: 'dashboard' }
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  exports: []
})
export class AppRoutingModule { }
