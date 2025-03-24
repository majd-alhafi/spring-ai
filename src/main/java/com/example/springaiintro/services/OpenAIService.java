package com.example.springaiintro.services;

import com.example.springaiintro.dtos.CapitalResponse;

public interface OpenAIService {
    String getAnswer(String question);
    CapitalResponse getCapital(String question);
}
