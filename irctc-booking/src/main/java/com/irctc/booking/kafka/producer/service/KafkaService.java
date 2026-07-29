package com.irctc.booking.kafka.producer.service;

import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	KafkaTemplate kafkaTemplate;
	/*
	 * producer without key will write to single partition
	 */
	public void publishMessage(String _topic,Object _message)
	{
		System.out.println("KafkaService.publishMessage():::::::::START:::::::::::");
		ProducerRecord record = new ProducerRecord<String,Object>(_topic,null,_message);
		
		kafkaTemplate.send(record);
		System.out.println("KafkaService.publishMessage():::::::::END:::::::::::");
	}
	/*
	 * producer with key will write to different Partitions
	 */
	
	 public void publishMessage(String topic, String key, Object message) {

	        try {

	            ProducerRecord<String, Object> record =
	                    new ProducerRecord<>(topic, key, message);

	            SendResult<String, Object> result =(SendResult<String, Object>) kafkaTemplate.send(record).get();

	            RecordMetadata metadata = result.getRecordMetadata();

	            System.out.println("--------------------------------------------");
	            System.out.println("Topic      : " + metadata.topic());
	            System.out.println("Partition  : " + metadata.partition());
	            System.out.println("Offset     : " + metadata.offset());
	            System.out.println("Key        : " + key);
	            System.out.println("--------------------------------------------");

	        } catch (InterruptedException | ExecutionException e) {
	            e.printStackTrace();
	        }
	    }
	
//	public void publishMessage(String topic, String key, Object message) {
//
//        System.out.println("KafkaService.publishMessage():::::::::START:::::::::::");
//
//        ProducerRecord<String, Object> record =
//                new ProducerRecord<>(topic, key, message);
//
//        kafkaTemplate.send(record);
//
//        System.out.println("Message Key      : " + key);
//        System.out.println("Message Published Successfully...");
//        System.out.println("KafkaService.publishMessage():::::::::END:::::::::::");
//    }
}
