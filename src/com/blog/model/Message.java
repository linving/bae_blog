package com.blog.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//����������
@Entity
public class Message implements Serializable{
	// ����Id
	private int messageId;
	// ��������
	private String messageContent;
	// ����ʱ��
	private Date messageTime;
	// ������
	private User masterUser;
	// �ÿ�
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
