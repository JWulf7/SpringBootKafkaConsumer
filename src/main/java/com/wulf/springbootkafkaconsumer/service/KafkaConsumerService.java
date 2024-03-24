package com.wulf.springbootkafkaconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);
	
	private static final String TOPIC = "myTopic.restCall";
	
	private static final String GROUPID = "myGroup";
	
	@KafkaListener(
			topics = TOPIC,
			groupId = GROUPID
			)
	public void consume(String eventMessage) {
		
		LOGGER.info(String.format("eventMessage recieved -> %s", eventMessage));
		
		
	}
	
}
