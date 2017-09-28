package io.github.yexiaoxiaogo.signin.dao;

import org.apache.ibatis.annotations.Param;

import io.github.yexiaoxiaogo.signin.domain.User;

public interface UserDao {

	//检查user的信息是否和数据库匹配
	public User checkUser(@Param("user")String user,@Param("password")String password);
}
