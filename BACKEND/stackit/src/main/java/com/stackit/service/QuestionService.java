package com.stackit.service;

import com.stackit.entity.Question;
import java.util.List;

public interface QuestionService {
    Question postQuestion(Question question);
    List<Question> getAllQuestions();
    Question getQuestionById(Long id);
    void deleteQuestion(Long id);
}
