package com.MotoassemblyPlant.solution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MotoassemblyPlant.solution.producer.MaterialProcurementProducer;

@RestController
@RequestMapping("/api/v1/MotoAssembly")
public class MotoAssemblyRestController {
	
     @Autowired
     private MaterialProcurementProducer materialProcurementProducer;
     
     
     @GetMapping("/materialProcureMessage")
     public ResponseEntity<String> postProcureMessage(@RequestParam("message") String message){
    	 materialProcurementProducer.materialProcurementMessage(message);
    	 return ResponseEntity.ok("Message sent to MotoAssemly Plant");
    	 
     }

}
