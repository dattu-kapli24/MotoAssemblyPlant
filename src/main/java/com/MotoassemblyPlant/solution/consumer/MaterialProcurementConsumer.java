package com.MotoassemblyPlant.solution.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MaterialProcurementConsumer {

	@Value("${spring.kafka.topic.name}")
	private String topicName;

	@Autowired
	private KafkaTemplate<String, String> KafkaTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(MaterialProcurementConsumer.class);

	@KafkaListener(topics="topicName")
	public void consumeProcurementMessage(String message) {

		LOGGER.info(String.format("Material Procurement Message %s", message));
		KafkaTemplate.send(topicName, message);
	}

}
