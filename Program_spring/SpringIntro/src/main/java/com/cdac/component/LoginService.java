package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("loginserv")
public class LoginService {
	public boolean isValidUser(String username, String password) {
		if (username.equals("vaibhav") && password.equals("123"))
			return true;
		return false;
	}
}
