package com.atguigu.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogingFilter implements Filter {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        //在请求之前有能力决定哪些请求要走过滤器
        //xxx请求在xxx时间被请求了
        String requestURI = req.getRequestURI();
        String time = dateFormat.format(new Date());

        System.out.println(requestURI+"资源在"+time+"时间被请求了");

        //放行
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        long end = System.currentTimeMillis();

        //响应之前
        System.out.println(requestURI+"资源在"+time+"时刻的请求耗时"+(end-start)+"毫秒");

    }
}
