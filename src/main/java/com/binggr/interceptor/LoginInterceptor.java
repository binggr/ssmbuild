package com.binggr.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: bing
 * @date: 2020/9/9 10:43
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        /**
         * 如果登录页面则放行
         */
        System.out.println("uri:"+request.getRequestURI());
        if(request.getRequestURI().contains("login")){
            return true;
        }

        HttpSession session = request.getSession();

        /**
         * 如果用户已登录放行
         */
        if(session.getAttribute("username")!=null){
            return true;
        }

        /**
         * 如果未登录则跳转到登录界面
         */
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
