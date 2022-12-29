package com.ohoraming.springmybatis.service;

import com.ohoraming.springmybatis.domain.User;
import com.ohoraming.springmybatis.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
