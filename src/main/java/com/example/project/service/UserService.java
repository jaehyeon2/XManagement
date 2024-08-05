package com.example.project.service;

import java.util.List;

import com.example.project.beans.model.UserModel;
import com.example.project.beans.param.UserParam;

public interface UserService {

//	Master
	public boolean istUser(UserParam userParam) throws Exception;
	public boolean udtUser(UserParam userParam) throws Exception;
	public boolean dltUser(UserParam userParam) throws Exception;
	
//	Slave
	public UserModel sltUser(UserParam userParam) throws Exception;
	public List<UserModel> sltUserList(UserParam userParam) throws Exception;
	
}
