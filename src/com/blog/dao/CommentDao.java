package com.blog.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.blog.model.Blog;
import com.blog.model.Comment;
import com.blog.model.User;
public interface CommentDao extends BaseDao<Comment> {
	/**
	 * ����������Ϣ
	 * 
	 * @param c
	 */
	public void saveComment(Comment c);

	/**
	 * ��ҳ��ȡĳ���͵�����
	 * 
	 * @param index
	 * @param size
	 * @param blog
	 * @return
	 */
	public List<Comment> getComments(int index, int size, Blog blog);

	/**
	 * ����ҳ��ȡ���͵�����
	 * 
	 * @param blog
	 * @return
	 */
	public List<Comment> getAllComments(Blog blog);

	/**
	 * ��ȡ������������
	 * 
	 * @param blog
	 * @return
	 */
	public Integer getCount(Blog blog);

	public Integer getCount(String hql);

	/**
	 * ��ȡ�û����������
	 * 
	 * @param u
	 * @return
	 */
	public List<Comment> getUserComments(User u);

	/**
	 * ��ȡ�û���ĳ�����͵�����
	 * 
	 * @param u
	 * @param blog
	 * @return
	 */
	public List<Comment> getUserComments(User u, Blog blog);

	/**
	 * 
	 * ɾ������
	 * 
	 * @param id
	 */

	public void deleteComentsById(Integer id);
}
