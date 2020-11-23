package cn.sinven.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lj
 * @create 2020-09-19 14:23
 * @email 1624058512@qq.com
 * 登录拦截器防止直接访问主页
 */
@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       Object user=request.getSession().getAttribute("user");
       if (user==null){
           request.setAttribute("mag","小伙这样是不行的，请先登录再访问!");
           request.getRequestDispatcher("index.html").forward(request,response);
           return false;
       }else {

           return true;
       }
    }
}
