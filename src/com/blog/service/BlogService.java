package com.blog.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.blog.model.Blog;

public interface BlogService {
	/**
	 * 保存博客
	 * 
	 */
	void saveBlog(Blog blog);

	/**
	 * 从session 中获取用户名等信息 用来保存博客
	 * 
	 * @param blog
	 * @param session
	 */
	void saveBlog(Blog blog, HttpSession session);

	/**
	 * 更新博客
	 * 
	 * @param blog
	 * @param session
	 */
	void updateBlog(Blog blog, HttpSession session);

	/**
	 * 从实体删除博客
	 * 
	 * @param blog
	 * @param session
	 */
	void deleteBlog(Blog blog, HttpSession session);

	/**
	 * 通过Id删除博客
	 * 
	 * @param blogId
	 */

	void deleteBlogById(Integer blogId);

	/**
	 * 通过Id获取博客
	 * 
	 * @param blogId
	 * @return
	 */
	Blog findBlogById(Integer blogId);

	/**
	 * 从session获取用户信息然后获取博客
	 * 
	 * @param session
	 * @return
	 */

	List<Blog> findBlogByUser(HttpSession session);

	/**
	 * 分页获取用户博客
	 * 
	 * @param index
	 * @param size
	 * @param session
	 * @return
	 */
	List<Blog> findBlogByUser(int index, int size, HttpSession session);

	/**
	 * 获取用户发过的博客条数
	 * 
	 * @param session
	 * @return
	 */

	Integer getBlogsCountByUser(HttpSession session);

	/**
	 * 分页获取所有博客
	 * 
	 * @param index
	 * @param size
	 * @return
	 */

	List<Blog> getAllBlogs(int index, int size);
}
