package com.luoyingmm.dao;

import com.luoyingmm.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getUser(int id);

    List<User> getUserLimit(Map<String,Integer> map);
}
