package com.rnd.springintegrations;

import java.util.Map.Entry;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
public class PrintService {

	public Message<?> print(Message<String> message) {
		
		System.out.println("Message Payload "+message.getPayload());
		for(Entry<String,Object>entry:message.getHeaders().entrySet()) {
			
			System.out.println("Header Key "+entry.getKey());
			System.out.println("Header Value "+entry.getValue());
		}
		return MessageBuilder.withPayload("new Message").build();

	}

}
