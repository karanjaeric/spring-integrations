package com.rnd.springintegrations;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
public class PrintService {

	public Message<?> print(Message<String> message) {
		
		System.out.println("Message Payload "+message.getPayload());
		int messageNumber=(int)message.getHeaders().get("messageNumber");
		return MessageBuilder.withPayload("Sending a reply for "+messageNumber).build();
	}

}
