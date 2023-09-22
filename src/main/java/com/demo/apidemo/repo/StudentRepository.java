package com.demo.apidemo.repo;

import com.demo.apidemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
