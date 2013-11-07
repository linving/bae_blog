package com.blog.dao;

import java.util.List;

import com.blog.model.Blog;
import com.blog.model.User;

public interface BlogDao extends BaseDao<Blog> {
	/**
	 * 
	 * ���沩��
	 * 
	 * @param blog
	 */
	void saveBlog(Blog blog);

	/**
	 * ͨ��Idɾ������
	 * 
	 * @param id
	 */

	void deleteByBlogById(Integer id);

	/**
	 * ͨ��ʵ��ɾ������
	 * 
	 * @param blog
	 */

	void deleteBlog(Blog blog);

	/**
	 * ���²���
	 * 
	 * @param blog
	 */
	void updateBlog(Blog blog);

	/**
	 * ͨ��id���Ҳ���
	 * 
	 * @param id
	 * @return
	 */

	Blog findBlogById(Integer id);

	/**
	 * ͨ���û������Ҹ��û����� ��ҳ����
	 * 
	 * @param u
	 * @return
	 */
	List<Blog> listBlogByUser(int index, int size, User u);

	/**
	 * ��ȡ�û������Ĳ��͵�����
	 * 
	 * @param u
	 * @return
	 */

	Integer getBlogsCountByUser(User u);

	/**
	 * ��ҳ�г����в���
	 * 
	 * @param index
	 * @param size
	 * @return
	 */

	List<Blog> listAllBlogs(int index, int size);
}
