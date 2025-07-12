package com.stackit.service;

import com.stackit.dao.AnswerDao;
import com.stackit.entity.Answer;
import com.stackit.entity.Question;
import com.stackit.exception.ResourceNotFoundException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService {

    private final AnswerDao answerDao;

    @Override
    public Answer postAnswer(Answer answer) {
        return answerDao.save(answer);
    }

    @Override
    public List<Answer> getAnswersByQuestion(Question question) {
        return answerDao.findByQuestion(question);
    }

    @Override
    public void acceptAnswer(Long id) {
        Answer answer = answerDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Answer not found with id: " + id));

        answer.setAccepted(true);
        answerDao.save(answer);
    }
}
