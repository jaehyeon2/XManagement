package com.example.project.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.project.beans.param.UserParam;

public class BaseService {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	protected SqlSession mDbDao;
	
	@Autowired
	protected SqlSession sDbDao;
	
	public String generateRandomString(){
		String randomString = RandomStringUtils.randomAscii(10);
		
		return randomString;
	}
	
	public void divideEmail(UserParam userParam){
		
		String email = userParam.getUserEmail();
		String[] dividedEmail = email.split("@");
		userParam.setUserId(dividedEmail[0]);
		userParam.setUserDomain(dividedEmail[1]);
		
	}

}
