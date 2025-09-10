package com.techprimers.messaging.standaloneactivemqexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StandaloneActivemqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandaloneActivemqExampleApplication.class, args);
	}
}

// 
/*
 * Reference: https://medium.com/@balmikprajapati53/integration-of-activemq-with-spring-boot-3-3-x-on-jdk-17-a-complete-guide-32fd2281df9d
 * 
 * URL: http://localhost:8081/rest/publish/send
 * Output:
 * Message sent: hello, world
 * Received message: hello, world
*/
