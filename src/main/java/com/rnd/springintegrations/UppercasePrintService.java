package com.rnd.springintegrations;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
public class UppercasePrintService {

	public void print(Message<String> message) {
		
		System.out.println("Message Payload "+message.getPayload().toUpperCase());
	}

}
