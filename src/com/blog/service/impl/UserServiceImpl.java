package com.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.dao.UserDao;
import com.blog.model.User;
import com.blog.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Override
	public void saveUser(User u) {
		// TODO Auto-generated method stub
		userDao.saveUser(u);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource(name = "userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> listUser(int index, int size) {
		// TODO Auto-generated method stub
		User u = new User();
		return userDao.listUser(index, size, u);
	}

	@Override
	public List<User> listAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub

		return userDao.findUserByName(name);
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.findUserById(id);
	}

	@Override
	public void delectUserByName(String name) {
		// TODO Auto-generated method stub
		userDao.delectUserByNameName(name);
	}

	@Override
	public void delectUserById(Integer id) {
		// TODO Auto-generated method stub
		userDao.delectUserById(id);
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		userDao.updateUser(u);
	}

	@Override
	public boolean userExits(String name) {
		// TODO Auto-generated method stub
		User user = this.findUserByName(name);
		if (user == null) {
			return false;
		}
		return true;
	}

}
