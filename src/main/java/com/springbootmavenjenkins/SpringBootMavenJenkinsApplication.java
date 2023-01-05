package com.springbootmavenjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMavenJenkinsApplication {
	
	Logger logger = LoggerFactory.getLogger(SpringBootMavenJenkinsApplication.class);
	
	
	@GetMapping("printmessgae")
	public String getMessage() {
		logger.info("getmessage method started");
		return "hi welcome to jenkins world";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMavenJenkinsApplication.class, args);
	}

}
