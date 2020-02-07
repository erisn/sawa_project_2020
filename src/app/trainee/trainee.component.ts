import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-trainee',
  templateUrl: './trainee.component.html',
  styleUrls: ['./trainee.component.css']
})
export class TraineeComponent implements OnInit {

  registrationTitle:string = "User Registration";

  firstName: string;
  lastName: string;
  userName: string;
  phoneNumber: string;

  constructor() { }

  ngOnInit() {
  }

}
