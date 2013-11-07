package com.blog.dao;

import java.util.List;

import com.blog.model.User;

public interface UserDao extends BaseDao<User> {
	/**
	 * 保存用户
	 * 
	 * @param u
	 */
	void saveUser(User u);

	/**
	 * 分页查找用户
	 * 
	 * @param index
	 * @param size
	 * @param u
	 * @return
	 */
	List<User> listUser(int index, int size, User u);

	List<User> listUser(int index, int size, String hql);

	/**
	 * 通过用户名查找用户
	 * 
	 * @param name
	 * @return
	 */
	User findUserByName(String name);

	User findUserById(Integer id);

	/**
	 * 删除用户
	 * 
	 * @param name
	 */
	void delectUserByNameName(String name);

	void delectUserById(Integer id);

	/**
	 * 更新实体
	 * 
	 */

	void updateUser(User u);

	

}
