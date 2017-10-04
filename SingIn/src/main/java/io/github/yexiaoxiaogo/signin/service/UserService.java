package io.github.yexiaoxiaogo.signin.service;

import io.github.yexiaoxiaogo.signin.domain.User;

public interface UserService {
//业务层接口通过用户名user和用户密码password实现用户登录
	public User Login(String username,String password);
	//注册
	public User Register(String username,String password);
}
