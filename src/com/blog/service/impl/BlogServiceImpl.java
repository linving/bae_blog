package com.blog.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.blog.dao.BlogDao;
import com.blog.model.Blog;
import com.blog.model.User;
import com.blog.service.BlogService;

@Component(value = "blogService")
public class BlogServiceImpl implements BlogService {
	private BlogDao blogDao;

	// 可以获取session
	// ActionContext context = ActionContext.getContext();

	public BlogDao getBlogDao() {
		return blogDao;
	}

	@Resource(name = "blogDao")
	public void setBlogDao(BlogDao blogDao) {
		this.blogDao = blogDao;
	}

	@Override
	public void saveBlog(Blog blog) {
		// TODO Auto-generated method stub
		// context.getSession();
		blogDao.save(blog);
	}

	@Override
	public void saveBlog(Blog blog, HttpSession session) {
		// TODO Auto-generated method stub
		User userId = (User) session.getAttribute("user");
		if (userId != null) {
			blog.setUserId(userId);
			blog.setSaveDate(new Date());
			blogDao.saveBlog(blog);
		}

	}

	@Override
	public void updateBlog(Blog blog, HttpSession session) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBlog(Blog blog, HttpSession session) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBlogById(Integer blogId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Blog findBlogById(Integer blogId) {
		// TODO Auto-generated method stub

		return blogDao.findBlogById(blogId);
	}

	@Override
	public List<Blog> findBlogByUser(HttpSession session) {
		// TODO Auto-generated method stub
		User u = (User) session.getAttribute("user");

		return blogDao.listBlogByUser(0, 6, u);
	}

	@Override
	public List<Blog> findBlogByUser(int index, int size, HttpSession session) {
		// TODO Auto-generated method stub
		User u = (User) session.getAttribute("user");

		return blogDao.listBlogByUser(index, size, u);
	}

	@Override
	public Integer getBlogsCountByUser(HttpSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getAllBlogs(int index, int size) {
		// TODO Auto-generated method stub

		return blogDao.listAllBlogs(index, size);
	}

}
