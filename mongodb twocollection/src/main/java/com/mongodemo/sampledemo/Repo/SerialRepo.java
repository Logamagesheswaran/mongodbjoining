package com.mongodemo.sampledemo.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongodemo.sampledemo.Datas.Serial;
public interface SerialRepo extends MongoRepository<Serial, String> {
}
