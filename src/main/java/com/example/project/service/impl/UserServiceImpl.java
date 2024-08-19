package com.example.project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.beans.model.UserModel;
import com.example.project.beans.param.UserParam;
import com.example.project.dao.master.MUserDao;
import com.example.project.dao.slave.SUserDao;
import com.example.project.service.BaseService;
import com.example.project.service.UserService;

@Service
public class UserServiceImpl extends BaseService implements UserService{
	
	@Autowired
	private String strKey;
	
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
			map.put("companyParentNo", userParam.getCompanyParentNo());
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
		UserModel user = null;
		
		try{
			Map<String, Object> map = new HashMap<>();
			map.put("userId", userParam.getUserId());
			map.put("userDomain", userParam.getUserDomain());
			
			user = sDbDao.getMapper(SUserDao.class).sltUser(map);
			if (user == null){
				logger.error("UserServiceImpl::sltUser::Error = user is not exist. userId = {}", userParam.getUserId());
				return null;
			}
		}catch (Exception e) {
			logger.error("UserServiceImpl::sltUSer::Error = {}", e.getMessage());
			return null;
		}
		return user;
	}

	@Override
	public List<UserModel> sltUserList(UserParam userParam) throws Exception {
		List<UserModel> userList = null;
		
		try{
			Map<String, Object> map = new HashMap<>();
			map.put("userKeyword", userParam.getUserKeyword());
			map.put("limitNum", userParam.getLimitNum());
			map.put("startNum", (userParam.getPageNum()-1)*userParam.getLimitNum());
			map.put("strKey", strKey);
			
			userList = sDbDao.getMapper(SUserDao.class).sltUserList(map);
			if (userList == null){
				logger.error("UserServiceImpl::sltUserList::Error = userList is not exist. userKeyword = {}", userParam.getUserKeyword());
				return null;
			}
		}catch(Exception e){
			logger.error("UserServiceImpl::sltUserList::Error = {}", e.getMessage());
			return null;
		}
		return userList;
	}
	
	@Override
	public int sltUserCount(UserParam userParam) throws Exception {
		int userCount = 0;
		
		try{
			Map<String, Object> map = new HashMap<>();
			map.put("userKeyword", userParam.getUserKeyword());
			
			userCount = sDbDao.getMapper(SUserDao.class).sltUserCount(map);
			if (userCount == 0){
				logger.error("UserServiceImpl::sltUserList::Error = userList is not exist. userKeyword = {}", userParam.getUserKeyword());
				return 0;
			}
		}catch(Exception e){
			logger.error("UserServiceImpl::sltUserList::Error = {}", e.getMessage());
			return 0;
		}
		
		return userCount;
	}

	@Override
	public List<UserModel> sltLowerUserList(UserParam userParam) throws Exception {
		List<UserModel> userList = null;
		
		try{
			Map<String, Object> map = new HashMap<>();
			map.put("companyParentNo", userParam.getCompanyParentNo());
			
			userList = sDbDao.getMapper(SUserDao.class).sltUserList(map);
			
		}catch (Exception e) {
			logger.error("UserServiceImpl::sltLowerUserList::Error = {}", e.getMessage());
			return null;
		}
		return userList;
	}
	
}
