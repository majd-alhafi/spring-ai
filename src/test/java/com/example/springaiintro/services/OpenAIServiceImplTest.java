package com.example.springaiintro.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OpenAIServiceImplTest {
    @Autowired
    OpenAIService openAIService;
    @Test
    void getAnswer() {
        String answer = openAIService.getAnswer("What is the capital of Saudi Arabia?");
        System.out.println(answer);
    }
}