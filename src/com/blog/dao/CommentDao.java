package com.blog.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.blog.model.Blog;
import com.blog.model.Comment;
import com.blog.model.User;
public interface CommentDao extends BaseDao<Comment> {
	/**
	 * 保存评论信息
	 * 
	 * @param c
	 */
	public void saveComment(Comment c);

	/**
	 * 分页获取某博客的评论
	 * 
	 * @param index
	 * @param size
	 * @param blog
	 * @return
	 */
	public List<Comment> getComments(int index, int size, Blog blog);

	/**
	 * 不分页获取博客的评论
	 * 
	 * @param blog
	 * @return
	 */
	public List<Comment> getAllComments(Blog blog);

	/**
	 * 获取博客评论条数
	 * 
	 * @param blog
	 * @return
	 */
	public Integer getCount(Blog blog);

	public Integer getCount(String hql);

	/**
	 * 获取用户发表的评论
	 * 
	 * @param u
	 * @return
	 */
	public List<Comment> getUserComments(User u);

	/**
	 * 获取用户对某条博客的评论
	 * 
	 * @param u
	 * @param blog
	 * @return
	 */
	public List<Comment> getUserComments(User u, Blog blog);

	/**
	 * 
	 * 删除评论
	 * 
	 * @param id
	 */

	public void deleteComentsById(Integer id);
}
