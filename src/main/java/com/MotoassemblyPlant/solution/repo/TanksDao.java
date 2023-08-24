package com.MotoassemblyPlant.solution.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MotoassemblyPlant.solution.models.Tanks;



@Repository
public interface TanksDao extends MongoRepository<Tanks,String> {

}
