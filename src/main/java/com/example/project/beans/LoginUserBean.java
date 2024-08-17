package com.example.project.beans;

import com.example.project.beans.enums.LoginResultEnum;
import com.example.project.beans.model.UserModel;

public class LoginUserBean {
	
	private UserModel user;
	private LoginResultEnum loginResultEnum;
	
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public LoginResultEnum getLoginResultEnum() {
		return loginResultEnum;
	}
	public void setLoginResultEnum(LoginResultEnum loginResultEnum) {
		this.loginResultEnum = loginResultEnum;
	}
}
