package com.techprimers.messaging.standaloneactivemqexample.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	
    @JmsListener(destination = "testQueue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
