package com.example.project.dao.slave;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.example.project.beans.model.UserModel;

public interface SUserDao {
	
	public UserModel sltUser(Map<String, Object> map) throws SQLException;
	public List<UserModel> sltUserList(Map<String, Object> map) throws SQLException;
	
}
