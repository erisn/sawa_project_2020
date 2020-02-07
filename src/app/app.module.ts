import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';

import { HOMEComponent } from './home/home.component';
import { MilitaryComponent } from './military/military.component';

import { TrainerComponent } from './trainer/trainer.component';

import { TraineeComponent } from './trainee/trainee.component';
import { HealthComponent } from './health/health.component';
import { AppRoutingModule} from './app-routing.module';
import { AdminComponent } from './admin/admin.component';
import { EducationComponent } from './education/education.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { ServiceComponent } from './service/service.component';
import { FormsModule }   from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    TraineeComponent,
    HealthComponent,
    MilitaryComponent,
    HOMEComponent,
    TrainerComponent,
    TraineeComponent,
    AdminComponent,
    EducationComponent,
    AboutComponent,
    ContactComponent,
    ServiceComponent,
   // SignupComponent
 ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
