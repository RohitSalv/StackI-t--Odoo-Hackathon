import { Component, OnInit } from '@angular/core';
import { QuestionService } from 'src/app/services/question-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  questions: any[] = [];
  totalQuestions = 0;
  searchQuery = '';

  constructor(
    private questionService: QuestionService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.fetchQuestions();
  }

  fetchQuestions(): void {
    this.questionService.getAllQuestions().subscribe(
      (data) => {
        this.questions = data;
        this.totalQuestions = data.length;
      },
      (error) => {
        console.error('Error fetching questions', error);
      }
    );
  }

  goToNotifications(): void {
    this.router.navigate(['/notifications']);
  }

  pageChanged(event: any): void {
    // optional pagination handling (if implemented later)
  }
}
