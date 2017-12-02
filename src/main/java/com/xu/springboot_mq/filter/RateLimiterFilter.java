package com.xu.springboot_mq.filter;


import com.google.common.util.concurrent.RateLimiter;

import org.apache.log4j.Logger;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 限流过滤器
 */
public class RateLimiterFilter implements Filter {
	private static Logger logger = Logger.getLogger(RateLimiterFilter.class);
	private RateLimiter rateLimiter = null ;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		rateLimiter = RateLimiter.create(1000);		//	1000 requests per second
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//		HttpServletRequest request = (HttpServletRequest)servletRequest;
//		HttpServletResponse response = (HttpServletResponse)servletResponse;

		if (rateLimiter.tryAcquire()){
			if (logger.isTraceEnabled()){
				logger.trace("get access");
			}
			filterChain.doFilter(servletRequest,servletResponse);
		}else{
			logger.info("system limitation reached!");
			//request.getRequestDispatcher("重定向地址").forward(request,response);
		}
	}

	@Override
	public void destroy() {

	}
}
