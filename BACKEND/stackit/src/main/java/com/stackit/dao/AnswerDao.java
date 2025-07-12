package com.stackit.dao;

import com.stackit.entity.Answer;
import com.stackit.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerDao extends JpaRepository<Answer, Long> {
    List<Answer> findByQuestion(Question question);
}
