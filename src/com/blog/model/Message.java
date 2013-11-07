package com.blog.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//给博主留言
@Entity
public class Message implements Serializable{
	// 留言Id
	private int messageId;
	// 留言内容
	private String messageContent;
	// 留言时间
	private Date messageTime;
	// 博客主
	private User masterUser;
	// 访客
	private User guestUser;

	@ManyToOne
	@JoinColumn(name = "guestUser")
	public User getGuestUser() {
		return guestUser;
	}

	@ManyToOne
	@JoinColumn(name = "masterUser")
	public User getMasterUser() {
		return masterUser;
	}

	public String getMessageContent() {
		return messageContent;
	}

	@Id
	@GeneratedValue
	public int getMessageId() {
		return messageId;
	}

	public Date getMessageTime() {
		return messageTime;
	}

	public void setGuestUser(User guestUser) {
		this.guestUser = guestUser;
	}

	public void setMasterUser(User masterUser) {
		this.masterUser = masterUser;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}

}
