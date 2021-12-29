package com.tell.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tell.model.Orders;

public interface OrderRepository extends MongoRepository<Orders, Integer>{

	

	

}
