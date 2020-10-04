package com.rnd.springintegrations;

import java.util.concurrent.Future;

import org.springframework.messaging.Message;

public interface PrintGateway {
	
public Future<Message<String>> print(Message<?> message);
 
}
