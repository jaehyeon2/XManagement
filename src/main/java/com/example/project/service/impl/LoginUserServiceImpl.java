package com.example.project.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.example.project.beans.model.UserModel;
import com.example.project.beans.param.LoginUserParam;
import com.example.project.service.BasicService;
import com.example.project.service.LoginUserService;

public class LoginUserServiceImpl extends BasicService implements LoginUserService{
	
	@Override
	public UserModel validateLoginUser(LoginUserParam loginUserParam) throws Exception {
		UserModel user = null;
		
		try{
			Map<String, Object> map = new HashMap<>();
			
		}catch(Exception e){
			
		}
		
		return null;
	}

}
