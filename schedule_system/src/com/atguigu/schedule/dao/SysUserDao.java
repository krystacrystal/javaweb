package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysUser;

public interface SysUserDao {

    /**
     * 向数据库中增加一条用户信息
     * @param sysUser 要增加的用户
     * @return 增加成功返回1，失败0
     */
    int addSysUser(SysUser sysUser);
}
