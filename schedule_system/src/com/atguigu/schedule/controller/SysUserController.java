package com.atguigu.schedule.controller;

import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.service.SysUserService;
import com.atguigu.schedule.service.impl.SysUserServiceImpl;
import com.atguigu.schedule.util.MD5Util;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/user/*")
public class SysUserController extends BaseController {

    private SysUserService userService = new SysUserServiceImpl();

    /**
     * 接受用户注册请求的业务处理方法
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收请求参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //调用服务层完成注册功能
        //将请求参数封装为SysUser对象，传入regist()方法中
        SysUser sysUser = new SysUser(null, username, userPwd);
        int rows = userService.regist(sysUser);
        //根据注册成功与否实现页面的跳转
        if (rows > 0) {
            resp.sendRedirect("/registSuccess.html");//绝对路径，当前项目没有上下文
        } else {
            resp.sendRedirect("/registFail.html");//绝对路径，当前项目没有上下文
        }
    }

    /**
     * 接受用户登录请求，完成登录的业务接口
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受请求参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        System.out.println(username);
        //调用Service层的业务，查询用户信息
        SysUser loginUser = userService.findByUsername(username);
        if (null == loginUser) {
            resp.sendRedirect("/loginUsernameError.html");
        } else if (!MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())) {
            resp.sendRedirect("/loginUserPwdError.html");
        } else {
            //登录成功跳转页面之前，先将登录用户的信息存入到session中
            HttpSession session = req.getSession();
            session.setAttribute("sysUser", loginUser);
            resp.sendRedirect("/showSchedule.html");
        }
    }
}
