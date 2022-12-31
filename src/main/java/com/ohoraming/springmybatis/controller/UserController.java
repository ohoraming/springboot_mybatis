package com.ohoraming.springmybatis.controller;

import com.ohoraming.springmybatis.domain.User;
import com.ohoraming.springmybatis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    /*
    user list 조회
    http://localhost:8080/api/v1/user/all
     */
    @GetMapping("/all")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    /*
    user 단건 조회
    http://localhost:8080/api/v1/user?id=2
     */
    @GetMapping
    public User getUser(@RequestParam String id) {
        return userService.getUser(id);
    }

    /*
    user 등록
    http://localhost:8080/api/v1/user/new
    JSON
    {
    "name": "입력",
    "email": "입력"
    }
     */
    @PostMapping("/new")
    public List<User> insertUser(@RequestBody User user) { // body로 들어오는 JSON 가져옴
        userService.insertUser(user);
        return userService.getUserList();
    }

    /*
    user 수정
    http://localhost:8080/api/v1/user/9
    JSON
    {
    "name": "입력",
    "email": "입력"
    }
     */
    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        userService.updateUser(id, user);
        return userService.getUser(id);
    }
}
