import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  // value = "http://localhost:4200/#/dashboard";
  public show = true;
  public notshow = true;
  public username = '';
  public password = '';
  public email = '';
  constructor(private router: Router) {}

  ngOnInit() {}

  toggle() {
    console.log('toggle');
    this.show = !this.show;
    // CHANGE THE NAME OF THE BUTTON.
  }
  toggle1() {
    this.show = true;
    // CHANGE THE NAME OF THE BUTTON.
  }
  login(username, password) {
    if (username === 'oe' && password === 'oe') {
      console.log('in oe');
      sessionStorage.setItem('role', 'oe');
      this.router.navigateByUrl('role/oe/oedash');
    }
    if (username === 're' && password === 're') {
      console.log('in re');
      sessionStorage.setItem('role', 're');
      this.router.navigateByUrl('role/re/redash');
    }
    if (username === 'bm' && password === 'bm') {
      console.log('in bm');
      sessionStorage.setItem('role', 'bm');
      this.router.navigateByUrl('role/bm/bmdash');
    }
    if (username === 'ac' && password === 'ac') {
      console.log('in ac');
      sessionStorage.setItem('role', 'ac');
      this.router.navigateByUrl('role/ac/acdash');
    }
    if (username === 'oh' && password === 'oh') {
      console.log('in oh');
      sessionStorage.setItem('role', 'oh');
      this.router.navigateByUrl('role/oh/ohdash');
    }
    if (username === 'audithead' && password === 'audithead') {
      console.log('in audithead');
      sessionStorage.setItem('role', 'audithead');
      this.router.navigateByUrl('role/audithead/auditheaddash');
    }
    if (username === 'cm' && password === 'cm') {
      console.log('in cm');
      sessionStorage.setItem('role', 'cm');
      this.router.navigateByUrl('role/cm/cmdash');
    }
  }
}
