import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-trainee',
  templateUrl: './trainee.component.html',
  styleUrls: ['./trainee.component.css']
})
export class TraineeComponent implements OnInit {

  registrationTitle:string = "";

  firstName: string;
  middlename: string;
  lastName: string;
  userName: string;

  constructor() { }

  ngOnInit() {
  }

}
