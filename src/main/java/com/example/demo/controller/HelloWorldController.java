package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

	@GetMapping(value ="/getMessage1")
	public String getMessage() {
		
		String value ="logTest";
		LOGGER.trace("doStuff needed more information - {}", value );
        LOGGER.debug("doStuff needed to debug - {}", value);
        LOGGER.info("doStuff took input - {}", value);
        LOGGER.warn("doStuff needed to warn - {}", value);
        LOGGER.error("doStuff encountered an error with value - {}", value);
        
		return "Hello World!";
	}
}
