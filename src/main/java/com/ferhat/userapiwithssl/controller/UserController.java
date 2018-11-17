package com.ferhat.userapiwithssl.controller;


import com.ferhat.userapiwithssl.entity.User;
import com.ferhat.userapiwithssl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/createuser")
    public User createUser(){
        return userService.createNewUser();
    }
}
