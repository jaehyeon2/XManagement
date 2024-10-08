package com.example.project.dao.slave;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.project.beans.model.UserModel;

@Repository
public interface SUserDao {
	
	public UserModel sltUser(Map<String, Object> map) throws SQLException;
	public List<UserModel> sltUserList(Map<String, Object> map) throws SQLException;
	public int sltUserCount(Map<String, Object> map) throws SQLException;	
	
	public UserModel sltLoginUser(Map<String, Object> map) throws SQLException;
	
}
