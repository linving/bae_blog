package com.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
//������
@Entity
public class Blog {
	// ����Id
	private int blogId;
	// ����
	private String blogTitle;
	// ����
	private String blogContent;
	// ����ʱ��
	private Date saveDate;
	// �������
	private int clickTimes;
	// �����û�
	private User userId;

	@Lob
	public String getBlogContent() {
		return blogContent;
	}

	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", blogTitle=" + blogTitle
				+ ", blogContent=" + blogContent + ", saveDate=" + saveDate
				+ ", clickTimes=" + clickTimes + ", userId=" + userId + "]";
	}

	@Id
	@GeneratedValue
	public int getBlogId() {
		return blogId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	
	public int getClickTimes() {
		return clickTimes;
	}

	public Date getSaveDate() {
		return saveDate;
	}

	@ManyToOne
	@JoinColumn(name = "userId")
	public User getUserId() {
		return userId;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public void setClickTimes(int clickTimes) {
		this.clickTimes = clickTimes;
	}

	public void setSaveDate(Date saveDate) {
		this.saveDate = saveDate;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

}
