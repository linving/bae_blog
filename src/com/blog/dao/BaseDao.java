package com.blog.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseDao<T> {
	/**
	 * 根据ID加载实体
	 * 
	 * @date 2013-5-17
	 * @param entityClass
	 * @param id
	 * @return
	 */
	T get(Class<T> entityClass, Serializable id);

	/**
	 * 保存实体
	 * 
	 * @param entity
	 * @return
	 */
	Serializable save(T entity);

	/**
	 * 更新实体
	 * 
	 * @param entity
	 */
	void update(T entity);

	/**
	 * 删除实体
	 * 
	 * @param entity
	 */
	void delete(T entity);

	/**
	 * 根据ID删除实体
	 * 
	 * @param entityClass
	 * @param id
	 */
	void delete(Class<T> entityClass, Serializable id);

	/**
	 * 获取总记录条数
	 * 
	 * @param hql
	 * @return
	 */
	Integer getCount(String hql);

	/**
	 * 分页查询
	 * 
	 * @param index
	 * @param size
	 * @param hql
	 * @return
	 */
	List<T> list(int index, int size, String hql);

	/**
	 * 分页查询 根据实体
	 * 
	 * @param index
	 * @param size
	 * @param hql
	 * @return
	 */
	List<T> list(int index, int size, T t);
	
	T get(String hql);
	
}
