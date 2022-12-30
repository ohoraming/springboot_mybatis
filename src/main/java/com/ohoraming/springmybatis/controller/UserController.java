package com.ohoraming.springmybatis.controller;

import com.ohoraming.springmybatis.domain.User;
import com.ohoraming.springmybatis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/all")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @GetMapping
    public User getUser(@RequestParam String id) {
        return userService.getUser(id);
    }
}
