package com.blog.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class User implements Serializable {
	// id
	private int id;

	// 用户名称 （登陆名称）
	private String username;
	// 用户登录密码
	private String password;
	// 用户邮箱
	private String email;

	// 博客上显示的名称
	private String blogName;
	// 博客上的签名
	private String blogDescription;
	// 注册时间
	private Date registerTime;
	public User() {
		
	}
	// 对应生成 longtext
	@Lob
	public String getBlogDescription() {
		return blogDescription;
	}

	public String getBlogName() {
		return blogName;
	}

	public String getEmail() {
		return email;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public String getUsername() {
		return username;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", email=" + email + ", blogName=" + blogName
				+ ", blogDescription=" + blogDescription + ", registerTime="
				+ registerTime + "]";
	}

}
