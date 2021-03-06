package com.rnd.springintegrations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@Configuration
@ImportResource("integrations/integrations-context.xml")
public class SpringintegrationApplication implements ApplicationRunner {
	@Autowired
	private PrintGateway gateway;

	public static void main(String[] args) {
		SpringApplication.run(SpringintegrationApplication.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Future<Message<String>>> futures = new ArrayList<>();

		for (int x = 0; x < 10; x++) {
			Message<String> message = MessageBuilder.withPayload("Printing message payload for " + x)
					.setHeader("messageNumber", x).build();
			this.gateway.print(message);
		}

	}
}
