import { Component, OnInit } from '@angular/core';
import { QuestionService } from 'src/app/services/question-service.service';
import { Router } from '@angular/router';
import { Editor } from 'ngx-editor';


@Component({
  selector: 'app-ask-question',
  templateUrl: './ask-question.component.html',
  styleUrls: ['./ask-question.component.css']
})
export class AskQuestionComponent implements OnInit {

  title = '';
  description = '';
  tags = '';
  editor!: Editor;

  constructor(
    private questionService: QuestionService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.editor = new Editor();
  }

  submitQuestion() {
    const newQuestion = {
      title: this.title,
      description: this.description,
      user: { id: 1 },  // static user for now, can be replaced with logged-in user later
      createdAt: new Date(),
      tags: this.tags.split(',').map(tag => tag.trim())
    };

    this.questionService.postQuestion(newQuestion).subscribe(
      () => {
        alert('Question posted successfully!');
        this.router.navigate(['/']);
      },
      (error) => {
        console.error('Error posting question:', error);
      }
    );
  }

  ngOnDestroy(): void {
    this.editor.destroy();
  }
}
