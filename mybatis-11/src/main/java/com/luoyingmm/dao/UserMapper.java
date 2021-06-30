package com.luoyingmm.dao;

import com.luoyingmm.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUser(@Param("id") int id);
}
