package com.gokhaneskin.repository;

import com.gokhaneskin.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
