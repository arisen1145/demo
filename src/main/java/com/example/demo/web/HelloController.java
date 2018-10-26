package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	private String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/hello")
	private String hello2(@RequestParam String name) {
		return "Hello "+name+"!";
	}

}
