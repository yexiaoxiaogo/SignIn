package io.github.yexiaoxiaogo.signin.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.yexiaoxiaogo.signin.domain.User;
import io.github.yexiaoxiaogo.signin.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	//登录注册页面
	@RequestMapping("/index")
	public String index(Model model){

			return "index";
		
	}
	
	//denglu 登录后跳转到一个登录页面
	@RequestMapping("/login")
	public String login(Model model){
//		public String login(User user,Model model){
//		user = userService.Login(user.getUsername(), user.getPassword());
//		if(user != null){
//			model.addAllAttributes((Collection<?>) user);
//			return "login";
//		}
		//return "index";

			return "login";
		
	}
	
	//zhuce 注册后跳转到登录注册页面，进行登录
	@RequestMapping("/register")
	public String register(@ModelAttribute User user,Model model){
	
		//创建User对象，表单获取user对象的user和password
		User user1 = new User();
		model.addAllAttributes("username",user1.getUsername());
		model.addAllAttributes("password",user1.getPassword());
		
		//插入数据库
		//userService.Register(user, password);
		return "register";
		
	}

}
