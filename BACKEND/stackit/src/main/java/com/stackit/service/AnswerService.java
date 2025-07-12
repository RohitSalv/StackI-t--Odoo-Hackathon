package com.stackit.service;

import com.stackit.entity.Answer;
import com.stackit.entity.Question;
import java.util.List;

public interface AnswerService {
    Answer postAnswer(Answer answer);
    List<Answer> getAnswersByQuestion(Question question);
    void acceptAnswer(Long id);
}
