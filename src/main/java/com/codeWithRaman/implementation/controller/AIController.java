package com.codeWithRaman.implementation.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {

	private final ChatClient chatClient;

	public AIController(ChatClient.Builder chatClientBuilder) {
		this.chatClient = chatClientBuilder.build();
	}

	@GetMapping("/message")
	public String generateResponse(@RequestParam String input) {
		return chatClient.call(input);
	}
}
