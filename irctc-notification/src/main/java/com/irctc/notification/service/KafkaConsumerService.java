package com.irctc.notification.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "booking-confirmed" ,groupId = "CG1")
	public void consume(ConsumerRecord<String,Object> record)
	{
		System.out.println("KafkaConsumerService.consume()....");
	Object message = 	record.value();
	System.out.println(message);
	}
}
