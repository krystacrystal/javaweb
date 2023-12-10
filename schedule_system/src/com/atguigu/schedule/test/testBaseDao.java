package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.pojo.SysUser;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class testBaseDao {
    private static BaseDao baseDao;


    @BeforeClass
    public static void initBaseDao() {
        baseDao = new BaseDao();
    }

    @Test
    public void test1() {
        String sql = "select count(1) from sys_user";
        Long count = baseDao.baseQueryObject(long.class, sql);
        System.out.println(count);
    }

    @Test
    public void test2() {
        String sql = "select uid,username userName,user_pwd userPwd from sys_user";
        List<Object> sysUserlist = baseDao.baseQuery(SysUser.class, sql);
        sysUserlist.forEach(System.out::println);
    }

    @Test
    public void test3() {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int row = baseDao.baseUpdate(sql, 1, "学习Java", 0);
        System.out.println(row);
    }
}
