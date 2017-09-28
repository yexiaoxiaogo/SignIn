package io.github.yexiaoxiaogo.signin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.yexiaoxiaogo.signin.domain.User;
import io.github.yexiaoxiaogo.signin.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index(String user,String password){
		User user2 = userService.Login(user, password);
		if(user2!=null){
			return "success";
		}
		else{
			return "fail";
		}
	}


	
}
