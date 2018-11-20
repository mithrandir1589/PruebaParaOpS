package mquint2.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import mquint2.springframework.services.HelloWorldService;

@Controller
public class GreetingController {
	
	private HelloWorldService helloWorldService;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}


	public String sayHello() {
		String greeting = helloWorldService.getGreeting();
		
		System.out.println(greeting);
		
		return greeting;
		
	}

}
