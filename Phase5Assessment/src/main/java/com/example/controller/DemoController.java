package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/getGreeting")
	public String getGreeting() {
		return "Hey, welcome to the demo project";
	}
}
