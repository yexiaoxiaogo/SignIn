package io.github.yexiaoxiaogo.signin.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.apache.zookeeper.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
//	@RequestMapping("/login")
//	public String login(Model model){
////		public String login(User user,Model model){
////		user = userService.Login(user.getUsername(), user.getPassword());
////		if(user != null){
////			model.addAllAttributes((Collection<?>) user);
////			return "login";
////		}
////		
////		return "index";
//
//			return "login";
//		
//	}
	@RequestMapping("/login")
	public ModelAndView Login(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("user:" + username + " pass:" + password);
		
		ModelAndView modelAndView =  new ModelAndView();
		
		/*User user = new User();
		// login 返回的是一个 user对象，不是bool值
		if(userService.Login(username, password) != null){
			modelAndView.addObject("user",user);
			modelAndView.setViewName("login");
		} else {
			modelAndView.setViewName("error");
		}*/
		
		User user = userService.Login(username, password);
		// login 返回的是一个 user对象，不是bool值
		if(user != null){
			modelAndView.addObject("user",user);
			modelAndView.setViewName("login");
		} else {
			System.out.println("user is null");
			modelAndView.setViewName("error");
		}
		
		
		return modelAndView;
	}
	
	//zhuce 注册后跳转到登录注册页面，进行登录
	@RequestMapping("/register")
	public String register(@ModelAttribute User user,Model model){
	
		//创建User对象，表单获取user对象的user和password
		User user1 = new User();
	//	model.addAllAttributes("username",user1.getUsername());
	//	model.addAllAttributes("password",user1.getPassword());
		
		//插入数据库
		//userService.Register(user, password);
		return "register";
		
	}

}
