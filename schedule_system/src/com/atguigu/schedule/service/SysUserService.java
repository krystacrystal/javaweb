package com.atguigu.schedule.service;

import com.atguigu.schedule.pojo.SysUser;

public interface SysUserService {

    /**
     * 注册功能
     * @param sysUser 用户名和明文密码以SysUser对象封装
     * @return 注册成功返回1，失败返回0
     */
    int regist(SysUser sysUser);
}
