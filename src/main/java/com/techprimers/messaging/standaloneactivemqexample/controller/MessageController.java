package com.techprimers.messaging.standaloneactivemqexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.techprimers.messaging.standaloneactivemqexample.producer.MessageProducer;

@RestController
@RequestMapping("/rest/publish")
public class MessageController {
	
    @Autowired
    private MessageProducer messageProducer;
    
    @GetMapping("/send")
    public String sendMessage() {
    	
        messageProducer.sendMessage();
        return "message sent successfully";
    }
}