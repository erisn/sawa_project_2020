import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { TraineeComponent } from './trainee/trainee.component';
import { MilitaryComponent } from './military/military.component';
import { HOMEComponent } from './home/home.component';
import { HealthComponent } from './health/health.component';
import { TrainerComponent } from './trainer/trainer.component';
import { AdminComponent } from './admin/admin.component';
import { EducationComponent } from './education/education.component';
//import { SignupComponent } from './signup/signup.component';
import {AboutComponent} from './about/about.component';
import {ContactComponent} from './contact/contact.component';
import {ServiceComponent} from './service/service.component';


const appRoutes: Routes=[
 {path: 'home', component: HOMEComponent},
 {path: 'trainee', component: TraineeComponent},
 {path: 'trainer', component: TrainerComponent},
 {path: 'military', component: MilitaryComponent},
{path: 'health', component: HealthComponent},
{path: 'admin', component:AdminComponent},
{path: 'contact', component: ContactComponent},
{path: 'about', component:AboutComponent},
{path: 'education', component: EducationComponent},
{path: 'service', component: ServiceComponent},
//{path:'signup', component: SignupComponent}

];
@NgModule({
  
  imports: [RouterModule.forRoot(appRoutes)
    
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }

