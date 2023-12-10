package com.atguigu.schedule.service.impl;

import com.atguigu.schedule.dao.SysUserDao;
import com.atguigu.schedule.dao.impl.SysUserDaoImpl;
import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.service.SysUserService;
import com.atguigu.schedule.util.MD5Util;

public class SysUserServiceImpl implements SysUserService {

    private SysUserDao sysUserDao=new SysUserDaoImpl();

    @Override
    public int regist(SysUser sysUser) {
        //将用户的明文密码转换为密文密码
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        //将注册信息存入数据库中
        return sysUserDao.addSysUser(sysUser);

    }
}
