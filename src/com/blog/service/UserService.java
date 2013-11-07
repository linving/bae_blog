package com.blog.service;

import java.util.List;

import com.blog.model.User;

public interface UserService {
	public void saveUser(User u);

	/**
	 * 分页列出
	 * 
	 * @param index
	 * @param size
	 * @return
	 */
	public List<User> listUser(int index, int size);

	/**
	 * 一次列出所有用户
	 * 
	 * @return
	 */
	public List<User> listAllUser();

	/**
	 * 查找单用户
	 * 
	 * @param name
	 * @return
	 */

	public User findUserByName(String name);

	public User findUserById(Integer id);

	/**
	 * 删除单用户
	 * 
	 * @param name
	 */

	public void delectUserByName(String name);

	public void delectUserById(Integer id);

	public void updateUser(User u);

	/**
	 * 判断用户是否存在
	 * 
	 * @param name
	 * @return
	 */
	public boolean userExits(String name);
}
