package com.irctc.booking.kafka.producer.service;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	KafkaTemplate kafkaTemplate;
	
	public void publishMessage(String _topic,Object _message)
	{
		System.out.println("KafkaService.publishMessage():::::::::START:::::::::::");
		ProducerRecord record = new ProducerRecord<String,Object>(_topic,null,_message);
		
		kafkaTemplate.send(record);
		System.out.println("KafkaService.publishMessage():::::::::END:::::::::::");
	}
}
