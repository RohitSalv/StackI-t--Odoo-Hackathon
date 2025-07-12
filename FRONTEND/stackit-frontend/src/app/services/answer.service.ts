import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AnswerService {

  private baseUrl = 'http://localhost:8092/api/answers';
  private voteUrl = 'http://localhost:8092/api/votes';

  constructor(private http: HttpClient) { }

  getAnswersByQuestion(questionId: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/question/${questionId}`);
  }

  postAnswer(answer: any): Observable<any> {
    return this.http.post(this.baseUrl, answer);
  }

  castVote(vote: any): Observable<any> {
    return this.http.post(this.voteUrl, vote);
  }

  acceptAnswer(answerId: number): Observable<any> {
    return this.http.put(`${this.baseUrl}/${answerId}/accept`, {});
  }
}
