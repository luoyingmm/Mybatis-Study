package com.luoyingmm.dao;

import com.luoyingmm.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserMap(Map<String,Object> map);

    List<User> getUserLike(String username);
}
