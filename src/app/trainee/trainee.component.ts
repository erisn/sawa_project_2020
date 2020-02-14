import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormControl } from '@angular/forms';
import { trainee} from './../trainee';
import { HttpServiceService } from './../http-service.service';
  



@Component({
  selector: 'app-trainee',
  templateUrl: './trainee.component.html',
  styleUrls: ['./trainee.component.css']
})
export class TraineeComponent implements OnInit {

  registrationTitle:string = "projectsawa";
  trainee: trainee  = new trainee();




  constructor() { }

  ngOnInit() {
  }
coffeefunction() {

  //please convert all input text into upper case
  var myVar:string;

  
    console.log("You are  clicking on submit LOL ")
    console.log(this.trainee);
    console.log("Data is commint HTMLS LOL , you got it ")
  // alert(myVar);
 }
}





