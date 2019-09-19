package org.arijit.demo.daemon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"org.arijit"})
public class DemoDaemon implements ApplicationRunner{

	private static final Logger logger = LogManager.getLogger(DemoDaemon.class);
	
	public static void main(String args[]) {
		
		SpringApplication.run(DemoDaemon.class, args);
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		logger.info("Starting DemoDaemon");
	}

	
}
