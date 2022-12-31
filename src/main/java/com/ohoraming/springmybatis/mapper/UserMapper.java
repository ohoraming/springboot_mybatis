package com.ohoraming.springmybatis.mapper;

import com.ohoraming.springmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getUserList();
    User getUser(String id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(String id);
}
