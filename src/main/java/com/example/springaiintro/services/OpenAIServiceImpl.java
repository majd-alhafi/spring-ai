package com.example.springaiintro.services;

import com.example.springaiintro.dtos.CapitalResponse;
import org.springframework.core.io.Resource;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.converter.BeanOutputConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OpenAIServiceImpl implements OpenAIService{
    private final ChatClient chatClient;
    @Value("classpath:templates/get-capital.st")
    private Resource getCapitalPromptWithInfo;
    public OpenAIServiceImpl(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @Override
    public String getAnswer(String question) {
        PromptTemplate promptTemplate = new PromptTemplate(question);
        Prompt prompt = promptTemplate.create();

        ChatResponse chatResponse = chatClient.prompt(prompt).call().chatResponse();

        return chatResponse.getResult().getOutput().getText();

    }

    @Override
    public CapitalResponse getCapital(String question) {
        BeanOutputConverter<CapitalResponse> converter = new BeanOutputConverter<>(CapitalResponse.class);
        String format = converter.getFormat();

        PromptTemplate promptTemplate = new PromptTemplate(getCapitalPromptWithInfo);
        Prompt prompt = promptTemplate.create(Map.of("stateOrCountry", question,
                "format", format));

        ChatResponse response = chatClient.prompt(prompt).call().chatResponse();

        return converter.convert(response.getResult().getOutput().getText());
    }
}
