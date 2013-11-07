package com.blog.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.blog.dao.BaseDao;

@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {
	/**
	 * 根据Id加载实体
	 */

	@SuppressWarnings("unchecked")
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public T get(Class<T> entityClass, Serializable id) {
		// TODO Auto-generated method stub
		return (T) this.getSessionFactory().getCurrentSession()
				.get(entityClass, id);
	}

	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return this.sessionFactory;
	}

	/**
	 * 保存实体
	 */

	@Override
	public Serializable save(T entity) {
		// TODO Auto-generated method stub
		return this.getSessionFactory().getCurrentSession().save(entity);
	}

	/**
	 * 更新实体
	 * 
	 */

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		this.getSessionFactory().getCurrentSession().saveOrUpdate(entity);

	}

	/**
	 * 
	 * 删除实体
	 */
	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		this.getSessionFactory().getCurrentSession().delete(entity);
	}

	/**
	 * 
	 * 根据Id删除实体
	 * 
	 */

	@Override
	public void delete(Class<T> entityClass, Serializable id) {
		// TODO Auto-generated method stub
		this.getSessionFactory().getCurrentSession()
				.delete(this.get(entityClass, id));

	}

	/**
	 * 获取数据库记录条数
	 * 
	 */

	@Override
	public Integer getCount(String hql) {
		// TODO Auto-generated method stub
		Query query = this.getSessionFactory().getCurrentSession()
				.createQuery(hql);
		List<Long> list = query.list();
		Long count = list.get(0);
		Integer c = new Integer(count.toString());
		return c == null ? 0 : c;
	}

	/**
	 * 
	 * 分页查询
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<T> list(int index, int size, String hql) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(hql);
		query.setFirstResult((index - 1) * size);
		query.setMaxResults(size);
		return query.list();
	}

	/**
	 * 根据分页查询
	 * 
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<T> list(int index, int size, T t) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(t.getClass());
//	 	criteria.add(Restrictions.)
		criteria.setFirstResult(index);
		criteria.setMaxResults(size);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(String hql) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(hql);
		query.setMaxResults(1);
		return (T) query.uniqueResult();
	}

	// 删除某个记录
	public void doHql(String hql) {
		Session session = this.getSessionFactory().getCurrentSession();
		// 执行更新
		Query query = session.createQuery(hql);
		query.executeUpdate();
	}
}
