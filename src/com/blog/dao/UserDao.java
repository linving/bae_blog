package com.blog.dao;

import java.util.List;

import com.blog.model.User;

public interface UserDao extends BaseDao<User> {
	/**
	 * �����û�
	 * 
	 * @param u
	 */
	void saveUser(User u);

	/**
	 * ��ҳ�����û�
	 * 
	 * @param index
	 * @param size
	 * @param u
	 * @return
	 */
	List<User> listUser(int index, int size, User u);

	List<User> listUser(int index, int size, String hql);

	/**
	 * ͨ���û��������û�
	 * 
	 * @param name
	 * @return
	 */
	User findUserByName(String name);

	User findUserById(Integer id);

	/**
	 * ɾ���û�
	 * 
	 * @param name
	 */
	void delectUserByNameName(String name);

	void delectUserById(Integer id);

	/**
	 * ����ʵ��
	 * 
	 */

	void updateUser(User u);

	

}
