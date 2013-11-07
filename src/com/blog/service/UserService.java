package com.blog.service;

import java.util.List;

import com.blog.model.User;

public interface UserService {
	public void saveUser(User u);

	/**
	 * ��ҳ�г�
	 * 
	 * @param index
	 * @param size
	 * @return
	 */
	public List<User> listUser(int index, int size);

	/**
	 * һ���г������û�
	 * 
	 * @return
	 */
	public List<User> listAllUser();

	/**
	 * ���ҵ��û�
	 * 
	 * @param name
	 * @return
	 */

	public User findUserByName(String name);

	public User findUserById(Integer id);

	/**
	 * ɾ�����û�
	 * 
	 * @param name
	 */

	public void delectUserByName(String name);

	public void delectUserById(Integer id);

	public void updateUser(User u);

	/**
	 * �ж��û��Ƿ����
	 * 
	 * @param name
	 * @return
	 */
	public boolean userExits(String name);
}
