package com.MotoassemblyPlant.solution.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.MotoassemblyPlant.solution.models.Brakes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MaterialProcurementConsumer {

	@Value("${spring.kafka.topic.name}")
	private String topicName;

	private static final Logger LOGGER = LoggerFactory.getLogger(MaterialProcurementConsumer.class);

	@KafkaListener(topics = "topicName", groupId = "motoAssemblyGroup")
	public void consumebrakesProcurementMessage(Brakes brakes) {
      LOGGER.info(String.format("Message  recieved --> %s", brakes.toString()));
      
	}

}
