package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "audit-topic", groupId = "group-id")
    public void listen(String message) {
        System.out.println("Consumed: " + message);
    }
}
