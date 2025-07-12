import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AskQuestionComponent } from './components/ask-question/ask-question.component';
import { QuestionDetailsComponent } from './components/question-details/question-details.component';
import { NotificationsComponent } from './components/notifications/notifications.component';

const routes: Routes = [
{ path: '', component: HomeComponent },
 { path: '', component: HomeComponent },
  { path: 'ask-question', component: AskQuestionComponent },
  { path: 'question/:id', component: QuestionDetailsComponent },
  { path: 'notifications', component: NotificationsComponent },
  { path: '**', redirectTo: '' }  // fallback route to home
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
