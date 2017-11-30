package com.xu.springboot_mq.service;

import com.xu.springboot_mq.Comment;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
@RabbitListener(queues = "object")
public class Receiver {

//	@RabbitHandler
//	public void process(String message){
//		System.out.println("Receiver:"+message);
//	}

	@RabbitHandler
	public void process(Comment comment){
		System.out.println("Receiver:"+comment);
	}

}
