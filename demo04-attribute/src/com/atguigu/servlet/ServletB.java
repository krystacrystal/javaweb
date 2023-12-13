package com.atguigu.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/servletB")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //拿数据
        //拿通过请求转发带来的请求域中的数据
        System.out.println("request=" + req.getAttribute("request"));
        //拿会话域中的数据
        HttpSession session = req.getSession();
        System.out.println("session=" + session.getAttribute("session"));
        //拿应用域中的数据
        ServletContext application = getServletContext();
        System.out.println("app=" + application.getAttribute("app"));
    }
}
