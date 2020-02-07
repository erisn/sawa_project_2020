import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-trainer',
  templateUrl: './trainer.component.html',
  styleUrls: ['./trainer.component.css']
})
export class TrainerComponent implements OnInit {
  title = 'coffee';
  firstName: string;
  lastName: string;
  email: string;
  phoneNumber: string;



  ngOnInit(){}

}
