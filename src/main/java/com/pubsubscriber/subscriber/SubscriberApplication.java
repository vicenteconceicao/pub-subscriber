package com.pubsubscriber.subscriber;

import com.pubsubscriber.subscriber.services.GoogleSubscriberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriberApplication.class, args);
		GoogleSubscriberService.subscribeAsync();
	}

}
