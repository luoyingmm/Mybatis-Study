package com.luoyingmm.dao;

import com.luoyingmm.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogWhen(Map map);

    int UpdateBlogSet(Map map);

    List<Blog> queryBlogForeach(Map map);
}
