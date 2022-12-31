package com.ohoraming.springmybatis.service;

import com.ohoraming.springmybatis.domain.User;
import com.ohoraming.springmybatis.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    public User getUser(String id) {
        return userMapper.getUser(id);
    }

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    public void updateUser(String id, User updateuser) {
        User user = userMapper.getUser(id);
        if (user != null) {
            user.setName(updateuser.getName());
            user.setEmail(updateuser.getEmail());
            userMapper.updateUser(user);
        } else {
            throw new IllegalStateException("회원이 존재하지 않습니다.");
        }
    }

    public void deleteUser(String id) {
        if (userMapper.getUser(id) != null) {
            userMapper.deleteUser(id);
        } else {
            throw new IllegalStateException("회원이 존재하지 않습니다.");
        }
    }

}
