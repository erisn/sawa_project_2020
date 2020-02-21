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




  constructor(private httpServiceService: HttpServiceService ) { }

  ngOnInit() {
  }


 
 submit() {

  this.httpServiceService
    .createTrainee(this.trainee)
    .subscribe(
      data =>{
        console.log(data);
        alert("Data is saved , please check your database");
      //  this.onChanges();
     
      },
      error =>{
        console.log("Retrieving person failed.");
        alert("Failed to save data");
      }
    );
}




}





