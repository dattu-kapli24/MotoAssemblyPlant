package com.MotoassemblyPlant.solution.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MotoassemblyPlant.solution.models.Brakes;



@Repository
public interface BrakesDao extends MongoRepository<Brakes,String>{

}
