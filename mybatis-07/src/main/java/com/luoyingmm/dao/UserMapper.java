package com.luoyingmm.dao;

import com.luoyingmm.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select * from mybatis.user")
    List<User> getUser();

    @Select("select * from mybatis.user where id=#{id} and name=#{name}")
    User getUserById(@Param("id") int id,@Param("name") String name);

    @Insert("insert into mybatis.user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update mybatis.user set pwd=#{password},name=#{name} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from mybatis.user where id=#{id}")
    int deleteUser(@Param("id") int id);

}
