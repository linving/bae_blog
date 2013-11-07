package com.blog.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.blog.model.Comment;

public interface CommentService {
	/**
	 * ��������
	 * 
	 * @param c
	 * @param session
	 * @param blogId
	 */
	public void saveComment(Comment c, HttpSession session, int blogId);

	/**
	 * �г� ����
	 * 
	 * @param blogId
	 * @param index
	 * @param size
	 * @return
	 */
	public List<Comment> listBlogComments(int blogId, int index, int size);

}
