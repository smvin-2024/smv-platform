package com.venture.smv.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.venture.smv.dto.ChatGPTResponse;
import com.venture.smv.dto.ChatRequest;
import com.venture.smv.service.OpenAIClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 2024
 *
 * @author utsav
 */
@RestController
@RequiredArgsConstructor
public class HelloController {
	private final OpenAIClientService openAIClientService;

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {

		return ResponseEntity.ok("Hello Spring Boot Boilerplate");
	}

	@PostMapping(value = "/chat", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ChatGPTResponse chat(@RequestBody ChatRequest chatRequest) throws JsonProcessingException {
		return openAIClientService.chat(chatRequest);
	}

}
