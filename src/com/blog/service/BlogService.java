package com.blog.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.blog.model.Blog;

public interface BlogService {
	/**
	 * ���沩��
	 * 
	 */
	void saveBlog(Blog blog);

	/**
	 * ��session �л�ȡ�û�������Ϣ �������沩��
	 * 
	 * @param blog
	 * @param session
	 */
	void saveBlog(Blog blog, HttpSession session);

	/**
	 * ���²���
	 * 
	 * @param blog
	 * @param session
	 */
	void updateBlog(Blog blog, HttpSession session);

	/**
	 * ��ʵ��ɾ������
	 * 
	 * @param blog
	 * @param session
	 */
	void deleteBlog(Blog blog, HttpSession session);

	/**
	 * ͨ��Idɾ������
	 * 
	 * @param blogId
	 */

	void deleteBlogById(Integer blogId);

	/**
	 * ͨ��Id��ȡ����
	 * 
	 * @param blogId
	 * @return
	 */
	Blog findBlogById(Integer blogId);

	/**
	 * ��session��ȡ�û���ϢȻ���ȡ����
	 * 
	 * @param session
	 * @return
	 */

	List<Blog> findBlogByUser(HttpSession session);

	/**
	 * ��ҳ��ȡ�û�����
	 * 
	 * @param index
	 * @param size
	 * @param session
	 * @return
	 */
	List<Blog> findBlogByUser(int index, int size, HttpSession session);

	/**
	 * ��ȡ�û������Ĳ�������
	 * 
	 * @param session
	 * @return
	 */

	Integer getBlogsCountByUser(HttpSession session);

	/**
	 * ��ҳ��ȡ���в���
	 * 
	 * @param index
	 * @param size
	 * @return
	 */

	List<Blog> getAllBlogs(int index, int size);
}
