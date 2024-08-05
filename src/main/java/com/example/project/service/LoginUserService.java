package com.example.project.service;

import com.example.project.beans.model.UserModel;
import com.example.project.beans.param.LoginUserParam;

public interface LoginUserService {
	
	public UserModel validateLoginUser(LoginUserParam loginUserParam) throws Exception;
}
