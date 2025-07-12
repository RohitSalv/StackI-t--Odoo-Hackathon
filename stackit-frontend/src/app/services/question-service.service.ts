import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  private baseUrl = 'http://localhost:8092/api/questions';

  constructor(private http: HttpClient) { }

  getAllQuestions(): Observable<any> {
    return this.http.get(this.baseUrl);
  }

  postQuestion(question: any): Observable<any> {
    return this.http.post(this.baseUrl, question);
  }

  getQuestionById(id: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
}
