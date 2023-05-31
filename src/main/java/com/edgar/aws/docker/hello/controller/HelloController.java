package com.edgar.aws.docker.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/hello")
	public ResponseEntity<String> printHello(@RequestParam String name){
		return ResponseEntity.ok("Hello , how are you :"+ name);
	}

}
