package com.luoyingmm.utils;

import org.junit.Test;

import java.util.UUID;

public class idUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }

    @Test
    public void test(){
        System.out.println(getId());
        System.out.println(getId());
        System.out.println(getId());
    }
}
