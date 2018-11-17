package com.ferhat.userapiwithssl.repository;


import com.ferhat.userapiwithssl.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
