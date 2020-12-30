package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessTestController {

	@GetMapping("/")
	public String processTest() {
		return "Process OK!!!!!!";
	}
	
}