package com.example.project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.project.beans.model.UserModel;
import com.example.project.beans.param.UserParam;
import com.example.project.dao.master.MUserDao;
import com.example.project.service.BasicService;
import com.example.project.service.UserService;

@Service
public class UserServiceImpl extends BasicService implements UserService{
	
	@Override
	public boolean istUser(UserParam userParam) throws Exception {
		
		int intResult = 0;		
		
		try{
			Map<String, Object> map = new HashMap<>();
			
			map.put("userName", userParam.getUserName());
			map.put("userEmail", userParam.getUserEmail());
			map.put("userAuth", userParam.getUserAuth());
			map.put("userPosition", userParam.getUserPosition());
			map.put("userResponsibility", userParam.getUserResponsibility());
			map.put("userClass", userParam.getUserClass());
			map.put("userId", userParam.getUserId());
			map.put("userDomain", userParam.getUserDomain());
			map.put("companyNo", userParam.getCompanyNo());
			map.put("departmentNo", userParam.getDepartmentNo());
			map.put("adminId", userParam.getAdminId());
			
			intResult = mDbDao.getMapper(MUserDao.class).istUser(map);
			
			if(intResult<1){
				logger.error("UserServiceImpl::istUser::Error = insert user error. userId = {}", userParam.getUserId());
				return false;
			}
			
		}catch(Exception e){
			logger.error("UserServiceImpl::istUser::Error = {}", e.getMessage());
			return false;
		}
		
		return true;
	}

	@Override
	public boolean udtUser(UserParam userParam) throws Exception {
		
		int intResult = 0;		
		
		try{
			Map<String, Object> map = new HashMap<>();
			
			map.put("userId", userParam.getUserId());
			map.put("userDomain", userParam.getUserDomain());
			
			intResult = mDbDao.getMapper(MUserDao.class).udtUser(map);
			
			if(intResult<1){
				logger.error("UserServiceImpl::udtUser::Error = update user error. userId = {}", userParam.getUserId());
				return false;
			}
			
		}catch(Exception e){
			logger.error("UserServiceImpl::udtUser::Error = {}", e.getMessage());
			return false;
		}
		
		return true;
	}

	@Override
	public boolean dltUser(UserParam userParam) throws Exception {
		
		int intResult = 0;		
		
		try{
			Map<String, Object> map = new HashMap<>();
			
			map.put("userId", userParam.getUserId());
			map.put("userDomain", userParam.getUserDomain());
			
			intResult = mDbDao.getMapper(MUserDao.class).dltUser(map);
			
			if(intResult<1){
				logger.error("UserServiceImpl::dltUser::Error = delete user error. userId = {}", userParam.getUserId());
				return false;
			}
			
		}catch(Exception e){
			logger.error("UserServiceImpl::dltUser::Error = {}", e.getMessage());
			return false;
		}
		
		return true;
	}

	@Override
	public UserModel sltUser(UserParam userParam) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserModel> sltUserList(UserParam userParam) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
