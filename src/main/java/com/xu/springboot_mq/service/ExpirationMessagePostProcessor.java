package com.xu.springboot_mq.service;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;

/**
 * Created by CharleyXu on 2017/12/14.
 * 设置队列消息的过期时间
 */
public class ExpirationMessagePostProcessor implements MessagePostProcessor {
  private Long ttl ;
  public ExpirationMessagePostProcessor(Long ttl){
    this.ttl = ttl ;
  }
  @Override
  public Message postProcessMessage(Message message) throws AmqpException {
    message.getMessageProperties().setExpiration(ttl.toString());
    return message;
  }
}
