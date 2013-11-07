package com.blog.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.blog.model.Comment;

public interface CommentService {
	/**
	 * 保存评论
	 * 
	 * @param c
	 * @param session
	 * @param blogId
	 */
	public void saveComment(Comment c, HttpSession session, int blogId);

	/**
	 * 列出 评论
	 * 
	 * @param blogId
	 * @param index
	 * @param size
	 * @return
	 */
	public List<Comment> listBlogComments(int blogId, int index, int size);

}
