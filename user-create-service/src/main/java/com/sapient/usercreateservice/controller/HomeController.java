package com.sapient.usercreateservice.controller;

import com.sapient.usercreateservice.entities.Users;
import com.sapient.usercreateservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public Users postUser(){
        return userService.createUser();
    }

}
