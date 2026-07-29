package com.irctc.notification.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	/*
	 * @KafkaListener(topics = "booking-confirmed-with-3-partitions" ,groupId = "CG1")
	 */
	@KafkaListener(
		    topics = "booking-confirmed-with-3-partitions",
		    groupId = "${spring.kafka.consumer.group-id}"
		)
	public void consume(ConsumerRecord<String,Object> record)
	{
		System.out.println("KafkaConsumerService.consume()....");
		System.out.println("\n==========================================");
		System.out.println("Topic      : " + record.topic());
		System.out.println("Partition  : " + record.partition());
		System.out.println("Offset     : " + record.offset());
		System.out.println("Key        : " + record.key());
		
		
		System.out.println("==========================================");
	Object message = 	record.value();
	System.out.println(message);
	}
	
	
//	@KafkaListener(topics = "booking-confirmed", groupId = "CG1")
//	public void consume(ConsumerRecord<String, BookingConfirmedEvent> record) {
//
//	    BookingConfirmedEvent event = record.value();
//
//	    System.out.println("\n==========================================");
//	    System.out.println("Topic      : " + record.topic());
//	    System.out.println("Partition  : " + record.partition());
//	    System.out.println("Offset     : " + record.offset());
//	    System.out.println("Key        : " + record.key());
//
//	    System.out.println("PNR Number : " + event.getPnrNumber());
//	    System.out.println("Train      : " + event.getTrainName());
//	    System.out.println("Passenger  : " + event.getUserName());
//
//	    System.out.println("==========================================");
//	}
}
