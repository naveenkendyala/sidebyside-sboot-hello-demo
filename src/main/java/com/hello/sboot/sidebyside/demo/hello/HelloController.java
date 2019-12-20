package com.hello.sboot.sidebyside.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

		
	@GetMapping("/hello")
	public String greetHello() {
		return "[springboot] : Hello !";
	}
	
	@GetMapping("/healthcheck")
	public String healthCheck() {
		return "OK";
	}	
	
	@GetMapping("/livecheck")
	public String liveCheck() {
		return "OK";
	}		
	
}
