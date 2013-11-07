package com.blog.dao;

import java.util.List;

import com.blog.model.Blog;
import com.blog.model.User;

public interface BlogDao extends BaseDao<Blog> {
	/**
	 * 
	 * 保存博客
	 * 
	 * @param blog
	 */
	void saveBlog(Blog blog);

	/**
	 * 通过Id删除博客
	 * 
	 * @param id
	 */

	void deleteByBlogById(Integer id);

	/**
	 * 通过实体删除博客
	 * 
	 * @param blog
	 */

	void deleteBlog(Blog blog);

	/**
	 * 更新博客
	 * 
	 * @param blog
	 */
	void updateBlog(Blog blog);

	/**
	 * 通过id查找博客
	 * 
	 * @param id
	 * @return
	 */

	Blog findBlogById(Integer id);

	/**
	 * 通过用户名查找该用户博客 分页查找
	 * 
	 * @param u
	 * @return
	 */
	List<Blog> listBlogByUser(int index, int size, User u);

	/**
	 * 获取用户发过的博客的条数
	 * 
	 * @param u
	 * @return
	 */

	Integer getBlogsCountByUser(User u);

	/**
	 * 分页列出所有博客
	 * 
	 * @param index
	 * @param size
	 * @return
	 */

	List<Blog> listAllBlogs(int index, int size);
}
