package com.luoyingmm.dao;

import com.luoyingmm.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    List<User> getUserLike(String msg);
    User getUserId(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    int AddUserMap(Map map);

    User getMapUSer(Map map);
}
