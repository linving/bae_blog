package com.blog.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

// 博客评论类

@Entity
public class Comment implements Serializable {
	// 评论Id
	private int commentID;
	// 被评论博客的Id
	private Blog blogId;
	// 评论该博客的用户Id
	private User userId;
	// 评论时间
	private Date commentTime;
	// 评论内容
	private String commentContent;

	@ManyToOne
	@JoinColumn(name = "blogId")
	public Blog getBlogId() {
		return blogId;
	}

	@Lob
	public String getCommentContent() {
		return commentContent;
	}

	@Override
	public String toString() {
		return "Comment [commentID=" + commentID + ", blogId=" + blogId
				+ ", userId=" + userId + ", commentTime=" + commentTime
				+ ", commentContent=" + commentContent + "]";
	}

	@Id
	@GeneratedValue
	public int getCommentID() {
		return commentID;
	}

	public Date getCommentTime() {
		return commentTime;
	}

	@ManyToOne
	@JoinColumn(name = "userId")
	public User getUserId() {
		return userId;
	}

	public void setBlogId(Blog blogId) {
		this.blogId = blogId;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

}
