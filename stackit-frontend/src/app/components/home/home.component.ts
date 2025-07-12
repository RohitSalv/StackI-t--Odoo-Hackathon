import { Component, OnInit } from '@angular/core';
import { QuestionService } from 'src/app/services/question-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  questions: any[] = [];
  totalQuestions = 0;
  searchQuery = '';

  constructor(private questionService: QuestionService) { }

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

  goToNotifications() {
    // navigate to notification page
  }

  pageChanged(event: any) {
    // handle pagination logic (if needed)
  }
}
