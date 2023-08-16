package com.MotoassemblyPlant.solution.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "MotoAssembly")
@Getter 
@Setter 
@NoArgsConstructor
public class MotoAssembly {
	
	@Id
    private String motorCycleNumber; 
   
	private String assemblyStatus;
	
	private Tanks tanks;
	
	private Brakes brakes;
}
