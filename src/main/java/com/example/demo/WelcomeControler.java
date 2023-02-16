package com.example.demo;



import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class WelcomeControler {
	
	
	Logger logger=(Logger) LoggerFactory.getLogger(WelcomeControler.class);
	@GetMapping(value="/welcome")
	public String getWelcome()
	{
		logger.info("welcome contoler method is started");
		
		String msg="I am wishing a good morning";
		logger.info("welcome contoler method is end");
		
		return msg;
	}
}
