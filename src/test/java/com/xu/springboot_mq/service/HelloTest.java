package com.xu.springboot_mq.service;

import com.xu.springboot_mq.bean.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HelloTest {

  @Autowired
  private Sender sender;

//  @Test
//  public void sendTest() {
//    sender.send();
//  }

  @Test
  public void sendObjectTest(){
    Comment comment = new Comment();
    comment.setId(123);
    comment.setContent("test");
    comment.setLinkedCount(1000);
    comment.setTime(System.currentTimeMillis());
    sender.sendObject(comment);
  }
}
