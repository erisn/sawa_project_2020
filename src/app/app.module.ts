import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { HOMEComponent } from './home/home.component';
import { MilitaryComponent } from './military/military.component';

import { TrainerComponent } from './trainer/trainer.component';

import { TraineeComponent } from './trainee/trainee.component';
import { HealthComponent } from './health/health.component';


@NgModule({
  declarations: [
    AppComponent,
    TraineeComponent,
    HealthComponent,
    MilitaryComponent,
    HOMEComponent,
    TrainerComponent,
    TraineeComponent
 ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
