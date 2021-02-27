package com.ycl.soft.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author wonderland
 * @Description 路径监视
 * @date 2020/10/179:29
 */
public class UrlFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("路径监听初始化！");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
          HttpServletRequest req = (HttpServletRequest) request;
          String url = req.getRequestURI();
          chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("路径监听销毁！");
    }
}
