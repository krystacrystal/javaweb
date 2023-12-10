package com.atguigu.schedule.test;

import com.atguigu.schedule.util.MD5Util;
import org.junit.Test;

public class testMD5Util {
    @Test
    public void test1(){
        String encrypt = MD5Util.encrypt("123456");
        System.out.println(encrypt);
    }
}
