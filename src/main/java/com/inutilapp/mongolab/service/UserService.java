package com.inutilapp.mongolab.service;

import com.inutilapp.mongolab.model.User;
import com.inutilapp.mongolab.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public Optional<User> addUser(User u) {
        User user = userRepo.save(u);
        return Optional.ofNullable(user);
    }

}
