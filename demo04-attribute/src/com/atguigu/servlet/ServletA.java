package com.atguigu.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //会话域-跨请求
        HttpSession session = req.getSession();
        session.setAttribute("session", "sessionAtt");

        //应用域-跨客户端
        ServletContext application = getServletContext();
        application.setAttribute("app", "appAtt");

        //请求域
        req.setAttribute("request", "requestAtt");
        req.getRequestDispatcher("servletB").forward(req, resp);


    }
}
