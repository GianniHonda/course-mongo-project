package com.giannihonda.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.giannihonda.workshopmongo.domain.User;
import com.giannihonda.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> findAll() {
        System.out.println("DATABASE = " + mongoTemplate.getDb().getName());
        System.out.println("COLLECTIONS = " + mongoTemplate.getCollectionNames());

        long count = mongoTemplate.getCollection("user").countDocuments();
        System.out.println("COUNT user = " + count);

        List<User> list = repo.findAll();
        System.out.println("TOTAL USERS = " + list.size());
        System.out.println(list);
        return list;
    }
}
