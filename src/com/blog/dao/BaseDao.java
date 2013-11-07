package com.blog.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseDao<T> {
	/**
	 * ����ID����ʵ��
	 * 
	 * @date 2013-5-17
	 * @param entityClass
	 * @param id
	 * @return
	 */
	T get(Class<T> entityClass, Serializable id);

	/**
	 * ����ʵ��
	 * 
	 * @param entity
	 * @return
	 */
	Serializable save(T entity);

	/**
	 * ����ʵ��
	 * 
	 * @param entity
	 */
	void update(T entity);

	/**
	 * ɾ��ʵ��
	 * 
	 * @param entity
	 */
	void delete(T entity);

	/**
	 * ����IDɾ��ʵ��
	 * 
	 * @param entityClass
	 * @param id
	 */
	void delete(Class<T> entityClass, Serializable id);

	/**
	 * ��ȡ�ܼ�¼����
	 * 
	 * @param hql
	 * @return
	 */
	Integer getCount(String hql);

	/**
	 * ��ҳ��ѯ
	 * 
	 * @param index
	 * @param size
	 * @param hql
	 * @return
	 */
	List<T> list(int index, int size, String hql);

	/**
	 * ��ҳ��ѯ ����ʵ��
	 * 
	 * @param index
	 * @param size
	 * @param hql
	 * @return
	 */
	List<T> list(int index, int size, T t);
	
	T get(String hql);
	
}
