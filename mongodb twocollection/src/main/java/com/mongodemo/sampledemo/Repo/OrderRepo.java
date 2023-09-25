package com.mongodemo.sampledemo.Repo;

import com.mongodemo.sampledemo.Datas.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<Order, String> {
}
