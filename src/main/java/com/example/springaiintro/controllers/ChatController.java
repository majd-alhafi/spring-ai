package com.example.springaiintro.controllers;

import com.example.springaiintro.dtos.CapitalResponse;
import com.example.springaiintro.dtos.Question;
import com.example.springaiintro.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    private final OpenAIService openAIService;

    public ChatController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/ask")
    public String answerQuestion(@RequestBody Question question){
        return openAIService.getAnswer(question.question());
    }
    @PostMapping("/getCapital")
    public CapitalResponse getCapital(@RequestBody Question question){
        return openAIService.getCapital(question.question());
    }
}
