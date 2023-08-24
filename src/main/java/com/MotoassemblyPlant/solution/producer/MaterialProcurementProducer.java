package com.MotoassemblyPlant.solution.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.MotoassemblyPlant.solution.models.Brakes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MaterialProcurementProducer {

	@Value("${spring.kafka.topic.name}")
	private String topicName;

	@Autowired
	private KafkaTemplate<String, Brakes> KafkaTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(MaterialProcurementProducer.class);

	public void brakesProcurementMessage(Brakes brakes) {
		  LOGGER.info(String.format("Message sent -> %s", brakes.toString()));
		
		Message<Brakes> message= MessageBuilder
				                 .withPayload(brakes)
				                 .setHeader(KafkaHeaders.TOPIC,topicName)
				                 .build();
		KafkaTemplate.send(message);
		//LOGGER.info("Brake Procurement Message sent to Plant-> %s",brakes.toString());
		
	}

}
