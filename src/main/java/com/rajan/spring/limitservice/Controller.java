package com.rajan.spring.limitservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {
	
	@Value("${app.minimum}")
	String minLimit;
	
	@Value("${message}")
	String message;
	
	@GetMapping(path="/limit")
	public String retrieveConfig() 
	{
		
		System.out.println(minLimit);
		System.out.println(message);
		return minLimit + "---" + message;
	}
}
