package com.stackit.service;

import com.stackit.dao.QuestionDao;
import com.stackit.entity.Question;
import com.stackit.exception.ResourceNotFoundException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionDao questionDao;

    @Override
    public Question postQuestion(Question question) {
        return questionDao.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Question not found with id: " + id));

    }

    @Override
    public void deleteQuestion(Long id) {
        questionDao.deleteById(id);
    }
}
