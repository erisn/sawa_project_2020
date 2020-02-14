import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class HttpServiceService {
  url = 'api/persons';
  urlPost = 'api/person';
  traineeTableUrl='/table';
  constructor(private http: HttpClient) { }

  getPersonsFromDatabase() {
    return this.http.get(this.traineeTableUrl);
  }

  createPerson (person: any) {
    return this.http.post<any>(this.traineeTableUrl, person);
  }
  createTrainee (trainee: any) {
    return this.http.post<any>(this.traineeTableUrl, trainee);
  }
}
