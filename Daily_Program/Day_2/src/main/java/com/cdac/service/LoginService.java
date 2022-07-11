package com.cdac.service;

public class LoginService {

	public boolean isValidUser(String username, String password) {
		if(username.equals("vaibhav")&& password.equals("123"))
			return true;
		return false;
	}

}
