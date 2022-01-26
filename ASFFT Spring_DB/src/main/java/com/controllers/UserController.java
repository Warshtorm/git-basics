package com.controllers;

import com.models.users.User;
import com.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(path = "list")
    public List<User> getAllUsers(){
        return userService.list();
    }

    @PostMapping(path = "item")
    public List<User> add(@RequestBody User user){
        userService.add(user);
        return userService.list();
    }
}
