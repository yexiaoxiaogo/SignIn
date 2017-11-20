package io.github.yexiaoxiaogo.signin.service;

import io.github.yexiaoxiaogo.signin.domain.User;

public interface UserService {
//业务层接口通过用户名user和用户密码password实现用户登录
	public User Login(String username,String password);
	//注册
	public Long Register(User user);
	////注册是否重复
	public User findNameByName(String username);

	// 通过用户名查询密码
	public String findPassworByName(String username);

}
