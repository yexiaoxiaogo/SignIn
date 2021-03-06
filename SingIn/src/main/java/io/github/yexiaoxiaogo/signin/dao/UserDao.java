package io.github.yexiaoxiaogo.signin.dao;

import org.apache.ibatis.annotations.Param;

import io.github.yexiaoxiaogo.signin.domain.User;

public interface UserDao {

	// 检查user的信息是否和数据库匹配，登录检测
	public User checkUser(@Param("username") String username, @Param("password") String password);

	// 注册 添加用户
	public Long insertUser(User user);

	// 注册是否重复
	public User findNameByName(String username);

	// 通过用户名查询密码
	public String findPassworByName(String username);

}
