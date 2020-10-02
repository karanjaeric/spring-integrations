package com.rnd.springintegrations;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

@SpringBootApplication
@Configuration
@ImportResource("integrations/integrations-context.xml")
public class SpringintegrationApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringintegrationApplication.class, args);
		System.out.println("spring integration project set up successfully");
	
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<String,Object> headersMap=new HashMap<>();
		headersMap.put("Content-Type", "Application/JSON");
//		Message<String> message=new GenericMessage<String>("creating a new message",new MessageHeaders(headersMap));
		Message<String> message=MessageBuilder.withPayload("Hello world").setHeader("Content-Type", "Application/JSON").build();
		PrintService printService=new PrintService();
		printService.print(message);
	}
}	
