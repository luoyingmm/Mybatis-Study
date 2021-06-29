package com.luoyingmm.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> list;

    public Teacher() {
    }
}
