package com.example.project.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicService {
	
	@Autowired
	protected SqlSession mDbDao;
	
	@Autowired
	protected SqlSession sDbDao;

}
