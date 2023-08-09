package com.MotoassemblyPlant.solution.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MaterialProcurementProducer {
	

    @Value("${spring.kafka.topic.name}")
    private String topicName;
	
     private KafkaTemplate<String, String> KafkaTemplate;
     
     private static final Logger LOGGER = LoggerFactory.getLogger(MaterialProcurementProducer.class);

 	public MaterialProcurementProducer(KafkaTemplate<String, String> KafkaTemplate) {
		this.KafkaTemplate = KafkaTemplate;
	}
	
	 

	public void  materialProcurementMessage(String message) {

		  LOGGER.info(String.format("Material Procurement Message %s", message));
		  KafkaTemplate.send(topicName, message);
	}

}

