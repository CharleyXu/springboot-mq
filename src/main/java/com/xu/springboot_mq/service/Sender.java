package com.xu.springboot_mq.service;

import com.xu.springboot_mq.bean.Comment;
import com.xu.springboot_mq.util.DateUtil;
import java.util.Date;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void send() {
		String context = "hello " + DateUtil.dateToString(new Date(),DateUtil.YYYYMMDD);
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("hello", context);
	}

	public void sendObject(Comment comment){
		System.out.println(comment.toString());
		this.rabbitTemplate.convertAndSend("object",comment);
	}
}
