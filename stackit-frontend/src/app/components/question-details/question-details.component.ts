import { Component, OnInit, Inject } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { QuestionService } from 'src/app/services/question-service.service';
import { AnswerService } from 'src/app/services/answer.service';
import { Editor } from 'ngx-editor';

@Component({
  selector: 'app-question-details',
  templateUrl: './question-details.component.html',
  styleUrls: ['./question-details.component.css']
})
export class QuestionDetailsComponent implements OnInit {

  question: any;
  answers: any[] = [];
  newAnswer = '';
  editor!: Editor;

  constructor(
    private route: ActivatedRoute,
    private questionService: QuestionService,
    @Inject(AnswerService) private answerService: AnswerService
  ) {}

  ngOnInit(): void {
    this.editor = new Editor();
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.getQuestion(id);
      this.getAnswers(id);
    }
  }

  getQuestion(id: string) {
    this.questionService.getQuestionById(id).subscribe(
      (data) => {
        this.question = data;
      },
      (error) => console.error(error)
    );
  }

  getAnswers(id: string) {
    this.answerService.getAnswersByQuestion(id).subscribe(
      (data) => {
        this.answers = data;
      },
      (error) => console.error(error)
    );
  }

  submitAnswer() {
    const answerPayload = {
      content: this.newAnswer,
      question: { id: this.question.id },
      user: { id: 1 },
      createdAt: new Date()
    };

    this.answerService.postAnswer(answerPayload).subscribe(
      () => {
        this.newAnswer = '';
        this.getAnswers(this.question.id);
      },
      (error) => console.error(error)
    );
  }

  upvote(answerId: number) {
    const votePayload = {
      upvote: true,
      answer: { id: answerId },
      user: { id: 1 }
    };

    this.answerService.castVote(votePayload).subscribe(
      () => {
        this.getAnswers(this.question.id);
      },
      (error) => console.error(error)
    );
  }

  acceptAnswer(answerId: number) {
    this.answerService.acceptAnswer(answerId).subscribe(
      () => {
        this.getAnswers(this.question.id);
      },
      (error) => console.error(error)
    );
  }

  ngOnDestroy(): void {
    this.editor.destroy();
  }
}
