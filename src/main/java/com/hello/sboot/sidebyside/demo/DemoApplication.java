package com.hello.sboot.sidebyside.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {	
		//Setup Default Configuration
		//Create the context
		//Perform class path scan 
		//Start Tomcat server
		SpringApplication.run(DemoApplication.class,args);
		
	}
	
}
