package com.example.springbootresttemplate.controller;

import com.example.springbootresttemplate.model.User;
import com.example.springbootresttemplate.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistertController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/addUser")
    public User save(@RequestBody User user) {
    	loginService.addUser(user);
        return user;
    }


    @GetMapping("/showUser")
    public List<User> getAll() {
        return loginService.getUsers();
    }

}
