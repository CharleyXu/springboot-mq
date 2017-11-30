package com.xu.springboot_mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 配置队列、交换器、路由等
 */
@Configuration
public class RabbitConfig {


	@Bean
	public Queue getQueue(){
		return new Queue("object");// durable 队列声明为持久化（durable）
	}
}
