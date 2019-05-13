package com.qf.controller;

import com.qf.pojo.Users;
import com.qf.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/users")
    public List<Users> getusers(){
        return userService.getAllUsers();
    }

}
