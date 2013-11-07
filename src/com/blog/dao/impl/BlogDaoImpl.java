package com.blog.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.blog.dao.BlogDao;
import com.blog.model.Blog;
import com.blog.model.User;

@Component(value = "blogDao")
public class BlogDaoImpl extends BaseDaoImpl<Blog> implements BlogDao {

	@Override
	public void saveBlog(Blog blog) {
		// TODO Auto-generated method stub
		if (blog != null) {
			this.save(blog);
		}
	}

	@Override
	public void deleteByBlogById(Integer id) {
		// TODO Auto-generated method stub
		Blog blog = this.findBlogById(id);
		this.delete(blog);
	}

	@Override
	public void deleteBlog(Blog blog) {
		// TODO Auto-generated method stub
		this.delete(blog);

	}

	@Override
	public void updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		this.update(blog);
	}

	@Override
	public Blog findBlogById(Integer id) {
		// TODO Auto-generated method stub
		String hql = "from Blog b where b.id = " + id;
		return this.get(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Blog> listBlogByUser(int index, int size, User u) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Blog.class);
		criteria.add(Restrictions.like("userId", u));
		criteria.setFirstResult(index);
		criteria.setMaxResults(size);
		return criteria.list();
	}

	@Override
	public Integer getBlogsCountByUser(User u) {
		// TODO Auto-generated method stub
		String hql = "selete * from Blog b where b.userId = " + u.getId();
		return this.getCount(hql);
	}

	@Override
	public List<Blog> listAllBlogs(int index, int size) {
		// TODO Auto-generated method stub
		return this.list(index, size, new Blog());
	}

}
