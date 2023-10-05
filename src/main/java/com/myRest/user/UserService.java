package com.myRest.user;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> listUser(){
        return this.userRepository.findAll();
    }
}
