package io.github.yexiaoxiaogo.signin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.github.yexiaoxiaogo.signin.service.UserService;

@Service
public class LoginService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("USER");
		grantedAuthorities.add(grantedAuthority);
		String password = userService.findPassworByName(username);
		
		System.out.println("username"+username+"   password="+password);
		return new User(username, password, grantedAuthorities);
	}

}
