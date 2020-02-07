import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-health',
  templateUrl: './health.component.html',
  styleUrls: ['./health.component.css']
})
export class HealthComponent implements OnInit {


  firstName: string;
  lastName: string;
  userName: string;
  phoneNumber: string;

  constructor() { }

  ngOnInit() {
  }

}
