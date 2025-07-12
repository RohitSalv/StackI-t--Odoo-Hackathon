package com.stackit.dao;

import com.stackit.entity.Vote;
import com.stackit.entity.Answer;
import com.stackit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteDao extends JpaRepository<Vote, Long> {
    int countByAnswerAndUpvoteIsTrue(Answer answer);
    int countByAnswerAndUpvoteIsFalse(Answer answer);
    boolean existsByUserAndAnswer(User user, Answer answer);
}
