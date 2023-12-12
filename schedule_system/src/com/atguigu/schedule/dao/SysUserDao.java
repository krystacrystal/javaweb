package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysUser;

public interface SysUserDao {

    /**
     * 向数据库中增加一条用户信息
     *
     * @param sysUser 要增加的用户
     * @return 增加成功返回1，失败0
     */
    int addSysUser(SysUser sysUser);

    /**
     * 根据用户名查询用户完整信息
     *
     * @param username 要查询的用户名
     * @return 查到了返回一个SysUser对象，没查到返回null
     */
    SysUser findByUsername(String username);
}
