package com.xu.springboot_mq;


import com.alibaba.fastjson.JSON;

public class Comment {
  private int id;//评论Id
  private int	songId;//歌曲Id
  private int  userId;//用户Id
  private String	nickname;//用户昵称
  private int	linkedCount;//点赞数
  private String	content;//内容
  private long time;//时间
  private Comment beReplied;//是否是回复的评论

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getSongId() {
    return songId;
  }

  public void setSongId(int songId) {
    this.songId = songId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public int getLinkedCount() {
    return linkedCount;
  }

  public void setLinkedCount(int linkedCount) {
    this.linkedCount = linkedCount;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }

  public Comment getBeReplied() {
    return beReplied;
  }

  public void setBeReplied(Comment beReplied) {
    this.beReplied = beReplied;
  }

  @Override
  public String toString() {
    return "Comment{" +
        "id=" + id +
        ", songId=" + songId +
        ", userId=" + userId +
        ", nickname='" + nickname + '\'' +
        ", linkedCount=" + linkedCount +
        ", content='" + content + '\'' +
        ", time=" + time +
        ", beReplied=" + beReplied +
        '}';
  }
}
