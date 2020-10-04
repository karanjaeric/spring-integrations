package com.rnd.springintegrations;


import org.springframework.messaging.Message;
public class PrintService {

	public void print(Message<String> message) {
		
		System.out.println("Message Payload "+message.getPayload());
	}

}
