import { Component, OnInit } from '@angular/core';
import { AcserviceService } from 'app/shared/acservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-acdash',
  templateUrl: './acdash.component.html',
  styleUrls: ['./acdash.component.scss']
})
export class AcdashComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }

  
  getDisb(){
    this.router.navigateByUrl('ac/disb');
  }

}
