package com.xu.springboot_mq.service;

import com.google.common.util.concurrent.RateLimiter;

import org.springframework.stereotype.Service;

@Service
public class AccessLimitService {
	//每秒只发出5个令牌		实际的比配置的大1
	RateLimiter rateLimiter = RateLimiter.create(5.0);

	/**
	 * 尝试获取令牌
	 * @return
	 */
	public boolean tryAcquire(){
		return rateLimiter.tryAcquire();
	}
}
