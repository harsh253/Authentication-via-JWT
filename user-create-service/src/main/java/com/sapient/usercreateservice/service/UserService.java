package com.sapient.usercreateservice.service;

import com.sapient.usercreateservice.entities.Users;
import com.sapient.usercreateservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserService {


    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;

    Users user = new Users(1,"Alice", encoder.encode("12345"),"USER");

    public Users createUser(){
        return userRepository.save(user);
    }



}
