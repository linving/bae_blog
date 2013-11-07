package com.blog.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.blog.dao.CommentDao;
import com.blog.model.Blog;
import com.blog.model.Comment;
import com.blog.model.User;

@Component(value = "commentDao")
public class CommentDaoImpl extends BaseDaoImpl<Comment> implements CommentDao {
	// private SessionFactory sessionFactory;

	@Override
	public void saveComment(Comment c) {
		// TODO Auto-generated method stub
		this.save(c);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getComments(int index, int size, Blog blog) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Comment.class);
		criteria.add(Restrictions.like("blogId", blog));
		criteria.setFirstResult(index);
		criteria.setMaxResults(size);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getAllComments(Blog blog) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		Criteria cri = session.createCriteria(Comment.class);
		cri.add(Restrictions.like("blogId", blog));
		return cri.list();

	}

	@Override
	public Integer getCount(Blog blog) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		Criteria cri = session.createCriteria(Comment.class);
		cri.add(Restrictions.like("blogId", blog));
		return cri.list().size();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getUserComments(User u) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		Criteria cri = session.createCriteria(Comment.class);
		cri.add(Restrictions.like("userId", u));
		return cri.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getUserComments(User u, Blog blog) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		Criteria cri = session.createCriteria(Comment.class);
		cri.add(Restrictions.like("userId", u));
		cri.add(Restrictions.like("blogId", blog));

		return cri.list();
	}

	@Override
	public void deleteComentsById(Integer id) {
		// TODO Auto-generated method stub
		String hql = "delete Comment c where c.commentID = " + id;
		this.doHql(hql);
	}

}
