package com.spring.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class samplecontroller {
	
	
	@GetMapping("/gade")
	public String messsage() {
		
		return "hello Pavani";
	}
	
	@GetMapping("/")
	public String hello() {
		
		return "hello SB";
	}

}
