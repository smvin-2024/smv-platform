package com.venture.smv.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.venture.smv.dto.ChatGPTRequest;
import com.venture.smv.dto.ChatGPTResponse;
import com.venture.smv.dto.ChatRequest;
import com.venture.smv.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class OpenAIClientService {

    private final static String ROLE_USER = "user";

    @Autowired
    @Qualifier("OpenAIRestTemplate")
    private RestTemplate restTemplate;

    public ChatGPTResponse chat(ChatRequest chatRequest) throws JsonProcessingException {
        Message message = Message.builder()
                .role(ROLE_USER)
                .content(chatRequest.getQuestion())
                .build();
        ChatGPTRequest chatGPTRequest = ChatGPTRequest.builder()
                .model("gpt-3.5-turbo")
                .messages(Collections.singletonList(message))
                .build();

        return restTemplate.postForObject("https://api.openai.com/v1/chat/completions", chatGPTRequest, ChatGPTResponse.class);

    }
}