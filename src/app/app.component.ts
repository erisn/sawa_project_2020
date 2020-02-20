import { Component ,  OnInit} from '@angular/core';
import { FormBuilder, Validators, FormControl } from '@angular/forms';
import {HttpServiceService} from './http-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  title = 'projectsawa';
  
 firstName: string;
 middleName: string;
 lastName: string;
 dateOfBirth: string;
 placeOfBirth : string;
 mobokeladi : string;
 zoba : string;
 subZoba : string;
 maritalStatus : string;
 educationLevel : string;
 profession : string;
 fatherFirstName : string;
 fatherMiddleName : string;
 fatherLastName : string;
 fatherDateOfBirth : string;
 fatherPlaceOfBirth : string;
 motherFirstName : string;
 motherMiddleName : string;
 motherLastName : string;
 motherDateOfBirth : string;
 motherPlaceOfBirth : string;
 Zoab: string;
 Subzoba: string;
 Mimhdar: string;
 ahadu: string;
 ahaduRound: string;
 height: string;
 kibdet: string;
 fluyMilkt: string;
 persons:any;
 person:Person = new Person();
 temp:number = 5**2;


  constructor(private httpServiceService:  HttpServiceService) { }


  ngOnInit() {

    //this.getAllPersons();
    this.getAllDataFromDatabase()
  }


   getAllDataFromDatabase(){

    this.httpServiceService.getPersonsFromDatabase()
    .subscribe(
      data =>{
        console.log(data);
        this.persons = data;
        this.firstName = data[0].firstName;
        this.middleName = data[0].middleName;
        this.lastName =  data[0].lastName;
        this.dateOfBirth = data[0].dateOfBirth;
        this.placeOfBirth = data[0].placeOfBirth;
        this.mobokeladi = data[0].mobokeladi;
       

      
      //  this.onChanges();
      },
      error =>{
        console.log("Retrieving person failed.");
      }
    );

   }



  createPerson() {

    this.person.firstName = this.firstName;
    this.person.middleName = this.middleName;
    this.person.lastName = this.lastName;
    this.person.dateOfBirth= this.dateOfBirth;
    this.person.placeOfBirth = this.placeOfBirth;


    this.httpServiceService
      .createPerson(this.person)
      .subscribe(
        data =>{
          this.persons = data;
          alert("Data is saved , please check your database");
        //  this.onChanges();
        this.getAllDataFromDatabase();
        },
        error =>{
          console.log("Retrieving person failed.");
          alert("Failed to save data");
        }
      );
  }

}


export class Person
{
  firstName: string ;
  middleName:string;
  lastName:  string ;
  dateOfBirth:string ;
  placeOfBirth : string ;
}
