package com.rnd.springintegrations;


import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
public class PrintService {

	public void print(Message<String> message) {
		
//		System.out.println("Message Payload "+message.getPayload());
		throw new RuntimeException("This is an error");
	}

}
