package com.example.project.service;

import com.example.project.beans.LoginUserBean;
import com.example.project.beans.param.LoginUserParam;

public interface LoginUserService {
	
	public LoginUserBean validateLoginUser(LoginUserParam loginUserParam) throws Exception;
}
