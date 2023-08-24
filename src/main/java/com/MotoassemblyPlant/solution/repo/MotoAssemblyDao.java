package com.MotoassemblyPlant.solution.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MotoassemblyPlant.solution.models.MotoAssembly;


@Repository
public interface MotoAssemblyDao extends MongoRepository<MotoAssembly,String> {

}
