package com.luoyingmm.dao;

import com.luoyingmm.pojo.User;
import com.luoyingmm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {
    @Test
    public void UserListTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void UserMapTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("id",1);
        map.put("username","狂神");
        User userMap = mapper.getUserMap(map);
        System.out.println(userMap.toString());

        sqlSession.close();
    }

    @Test
    public void UserLikeTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> like = mapper.getUserLike("张");
        for (User user : like) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }
}
