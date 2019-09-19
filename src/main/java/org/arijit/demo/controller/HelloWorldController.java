package org.arijit.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloWorldController {

	private static final Logger logger = LogManager.getLogger(HelloWorldController.class);
	
	@RequestMapping(value="/ping", method = RequestMethod.GET)
	public @ResponseBody String ping() {
		return "pong";
	}
	
	@RequestMapping(value = "/hello/{name}", method = {RequestMethod.GET, RequestMethod.HEAD})
	public @ResponseBody ResponseEntity<String> sayHello(@PathVariable("name") String name) {
		logger.info("Request from : "+name);
		String responseString = "Hello!!! "+name;
		ResponseEntity<String> response = new ResponseEntity<String>(responseString, HttpStatus.OK);
		
		return response;
	}
}
