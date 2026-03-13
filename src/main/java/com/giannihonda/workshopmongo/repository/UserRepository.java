package com.giannihonda.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.giannihonda.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
