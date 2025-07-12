package com.stackit.service;

import com.stackit.dao.VoteDao;
import com.stackit.entity.Vote;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoteServiceImpl implements VoteService {

    private final VoteDao voteDao;

    @Override
    public Vote castVote(Vote vote) {
        return voteDao.save(vote);
    }
}
