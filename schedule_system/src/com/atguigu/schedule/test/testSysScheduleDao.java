package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.SysScheduleDao;
import com.atguigu.schedule.dao.impl.SysScheduleDaoImpl;
import com.atguigu.schedule.pojo.SysSchedule;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class testSysScheduleDao {
    private static SysScheduleDao sysScheduleDao;

    @BeforeClass
    public static void initSysScheduleDao() {
        sysScheduleDao = new SysScheduleDaoImpl();//多态，父类的引用指向子类的对象
    }

    @Test
    public void test1() {
        int rows = sysScheduleDao.addSchedule(new SysSchedule(null, 2, "学习数据库", 1));
        System.out.println(rows);

    }

    @Test
    public void test2() {
        List<SysSchedule> sysScheduleList = sysScheduleDao.findAll();
        sysScheduleList.forEach(System.out::println);
    }
}
