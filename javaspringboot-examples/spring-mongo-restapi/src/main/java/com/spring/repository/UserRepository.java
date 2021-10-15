package com.spring.repository;

import com.spring.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 15/10/2021
 **   Time : 8:21 AM
 **/

public interface UserRepository extends MongoRepository<User, String> {
}
