package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	// http://localhost:8080/say 	: URL 
	
	@GetMapping(value = "say",produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayHello() {
		return "<h2>Welcome to Spring boot rest controller</h2>";
	}
	
	// http://localhost:8080/say 	: URL 
	@GetMapping(value = "html",produces = MediaType.TEXT_HTML_VALUE)
	public String sayHTML() {
		return "<h2>Welcome to Spring boot rest controller</h2>";
	}
}
