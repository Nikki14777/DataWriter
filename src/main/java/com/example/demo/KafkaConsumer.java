package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.demo.entity.AuditTableEntity;
import com.example.demo.repository.Auditrepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class KafkaConsumer {
	
	@Autowired
	private Auditrepository auditrepository;

	@KafkaListener(topics = "audit-topic", groupId = "group-id")
    public void listen(String message) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
        System.out.println("Consumed: " + message);
        AuditTableEntity auditTableEntity = mapper.readValue(message,AuditTableEntity.class);
        auditrepository.save(auditTableEntity);
    }
}
