package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	final static Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/monitor")
	public String monitor()
	{
		 // Logging various log level messages 
		 	logger.info("INFO log message");
	        logger.debug("DEBUG log message");
	        logger.warn("WARN log message");
	        logger.error("ERROR log message");
	        return "Logs generated! Check the console and log files.";
		
	}
}
