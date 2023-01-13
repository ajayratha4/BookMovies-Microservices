package com.user.user.controller;

import com.user.user.entites.User;
import com.user.user.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping
    public List<User> getUsers() {
        return userServices.getUser();
    }

    @GetMapping("/signin")
    public User signIn(@RequestBody User user) {
        return userServices.signIn(user);
    }

    @PostMapping("/signup")
    public User createUser(@RequestBody User user) {
        return userServices.createUser(user);
    }

}
