package com.luoyingmm.dao;

import com.luoyingmm.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacher();

    Teacher getTeacher2(@Param("tid") int id);
}
