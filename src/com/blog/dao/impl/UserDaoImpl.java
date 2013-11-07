package com.blog.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.blog.dao.UserDao;
import com.blog.model.User;

@Component(value = "userDao")
@Transactional
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public void saveUser(User u) {
		// TODO Auto-generated method stub
		if (u != null) {
			this.save(u);

		} else {

		}
	}

	@Override
	public List<User> listUser(int index, int size, User u) {
		// TODO Auto-generated method stub

		return this.list(index, size, u);
	}

	@Override
	public List<User> listUser(int index, int size, String hql) {
		// TODO Auto-generated method stub
		return this.listUser(index, size, hql);
	}

	/**
	 * 通过用户名查找用户
	 */
	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from User u where u.username = '" + name + "'";

		return this.get(hql);
	}

	@Override
	public void delectUserByNameName(String name) {
		// TODO Auto-generated method stub
		User u = this.findUserByName(name);
		System.out.println("delectUserByNameName" + u);
		this.delete(u);
	}

	@Override
	public void delectUserById(Integer id) {
		// TODO Auto-generated method stub
		User u = new User();
		Class<User> entityClass = null;
		// this.delete(entityClass, id);
		this.doHql("delete User u where u.id = " + id);

	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		String hql = "from User u where u.id = " + id;
		return this.get(hql);
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		this.update(u);
	}

}
