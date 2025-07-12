package com.stackit.controller;

import com.stackit.entity.Answer;
import com.stackit.entity.Question;
import com.stackit.service.AnswerService;
import com.stackit.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/answers")
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerService answerService;
    private final QuestionService questionService;

    @PostMapping
    public Answer postAnswer(@RequestBody Answer answer) {
        return answerService.postAnswer(answer);
    }

    @GetMapping("/question/{questionId}")
    public List<Answer> getAnswersByQuestion(@PathVariable Long questionId) {
        Question question = questionService.getQuestionById(questionId);
        return answerService.getAnswersByQuestion(question);
    }

    @PutMapping("/{id}/accept")
    public void acceptAnswer(@PathVariable Long id) {
        answerService.acceptAnswer(id);
    }
}
