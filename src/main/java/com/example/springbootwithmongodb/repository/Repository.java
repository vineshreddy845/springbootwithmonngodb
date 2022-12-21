package com.example.springbootwithmongodb.repository;

import com.example.springbootwithmongodb.model.Pojo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface Repository extends MongoRepository<Pojo,String> {
}
