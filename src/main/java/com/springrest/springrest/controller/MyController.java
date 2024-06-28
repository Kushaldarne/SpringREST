package com.springrest.springrest.controller;

import java.util.List;

//import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.springrest.entites.User;
import com.springrest.springrest.services.UserService;


@RestController
@RequestMapping("/api/user")
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home() {
        return "!! Welcome to Home Page !!";
    }

    //fetch the Users
    @GetMapping("/fetch")
    public List<User> getUser(){
        
        return this.userService.getUser();
    }

    @GetMapping("/fetch/{userId}")
    public User getUser(@PathVariable String userId){
        return this.userService.getUser(Long.parseLong(userId));
    }

    @GetMapping("/fetchByUsername")
    public User getUserByUsername(@RequestParam String username){
        return this.userService.getUserByUsername(username);
    }

    @PostMapping("/register")
    public User addUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }
}
