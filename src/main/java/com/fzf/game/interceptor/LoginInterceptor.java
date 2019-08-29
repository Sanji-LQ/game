package com.fzf.game.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println(request.getSession().getId());
        Object user = request.getSession().getAttribute("user");
        if(user!=null){
            return true;
        }
        response.sendRedirect("/error");
        return false;

    }
}
