package com.stackit.controller;

import com.stackit.entity.Vote;
import com.stackit.service.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/votes")
@RequiredArgsConstructor
public class VoteController {

    private final VoteService voteService;

    @PostMapping
    public Vote castVote(@RequestBody Vote vote) {
        return voteService.castVote(vote);
    }
}
