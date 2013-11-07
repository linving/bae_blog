package com.blog.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.blog.dao.CommentDao;
import com.blog.model.Blog;
import com.blog.model.Comment;
import com.blog.model.User;
import com.blog.service.BlogService;
import com.blog.service.CommentService;

@Service(value = "commentService")
public class CommentServiceImpl implements CommentService {
	private CommentDao commentDao;

	private BlogService blogService;

	public BlogService getBlogService() {
		return blogService;
	}

	@Resource(name = "blogService")
	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}

	public CommentDao getCommentDao() {
		return commentDao;
	}

	@Resource(name = "commentDao")
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	@Override
	public void saveComment(Comment c, HttpSession session, int blogId) {
		// TODO Auto-generated method stub
		User userId = (User) session.getAttribute("user");
		if (userId != null) {
			Blog b = blogService.findBlogById(blogId);
			c.setBlogId(b);
			c.setCommentTime(new Date());
			c.setUserId(userId);
			System.out.println(c.toString());
			commentDao.saveComment(c);
		}

	}

	@Override
	public List<Comment> listBlogComments(int blogId, int index, int size) {
		// TODO Auto-generated method stub
		Blog b = blogService.findBlogById(blogId);
		return commentDao.getComments(index, size, b);

	}

}
