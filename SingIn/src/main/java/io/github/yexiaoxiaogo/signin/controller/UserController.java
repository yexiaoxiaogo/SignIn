package io.github.yexiaoxiaogo.signin.controller;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.yexiaoxiaogo.signin.domain.User;
import io.github.yexiaoxiaogo.signin.service.UserService;
import junit.framework.Test;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index(Model model){

			return "index";
		
	}
//	@RequestMapping("/error")
//	public String error(Model model){
//
//			return "error";
//		
//	}
	
	@RequestMapping("/test")
	public String Test() {
		return "test";
	}
	
	//zhuce
	@RequestMapping("/register")
	public String register(){
		//创建User对象
		User user = new User();
		//插入数据库
		return null;
		 
		
	}


	
}
