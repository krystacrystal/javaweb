package com.atguigu.schedule.dao.impl;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.dao.SysUserDao;
import com.atguigu.schedule.pojo.SysUser;

public class SysUserDaoImpl extends BaseDao implements SysUserDao {

    @Override
    public int addSysUser(SysUser sysUser) {
        String sql="insert into sys_user values(DEFAULT,?,?)";
        return baseUpdate(sql,sysUser.getUserName(),sysUser.getUserPwd());

    }
}
