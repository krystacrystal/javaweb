package com.atguigu.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = {"/servlet1","/servletA"})
public class Filter1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //在请求到目标资源之前的功能实现
        System.out.println("before doFilter");

        //放行
        filterChain.doFilter(servletRequest,servletResponse);

        //在响应给客户端之前
        System.out.println("after doFilter");

    }
}
