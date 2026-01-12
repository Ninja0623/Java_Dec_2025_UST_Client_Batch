package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

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
	// http://localhost:8080/employee 
	// {"id":100,"name":"ravi","salary":14000}	json format. 
	
	
}



