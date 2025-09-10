package com.techprimers.messaging.standaloneactivemqexample.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	private static final String QUEUE_NAME = "testQueue";

	public void sendMessage() {
		
		String message = "hello, world";
		jmsTemplate.convertAndSend(QUEUE_NAME, message);
		System.out.println("Message sent: " + message);
	}
}