package com.atguigu.schedule.service;

import com.atguigu.schedule.pojo.SysUser;

public interface SysUserService {

    /**
     * 注册功能
     *
     * @param sysUser 用户名和明文密码以SysUser对象封装
     * @return 注册成功返回1，失败返回0
     */
    int regist(SysUser sysUser);

    /**根据用户名查询用户完整信息
     * @param username 要查询的用户名
     * @return 查到了返回一个SysUser对象，没查到返回null
     */
    SysUser findByUsername(String username);
}
