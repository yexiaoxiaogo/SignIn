package io.github.yexiaoxiaogo.signin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.yexiaoxiaogo.signin.dao.UserDao;
import io.github.yexiaoxiaogo.signin.domain.User;
import io.github.yexiaoxiaogo.signin.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	//实现登录
	public User Login(String user,String password){
		return userDao.checkUser(user, password);
	}
	//实现注册
	public User Register(String user,String  password){
		return userDao.insertUser(user, password);
	}

}
