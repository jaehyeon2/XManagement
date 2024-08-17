package com.example.project.dao.master;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface MDepartmentDao {

	public int istDepartment(Map<String, Object> map) throws SQLException;
	public int udtDepartment(Map<String, Object> map) throws SQLException;
	public int dltDepartment(Map<String, Object> map) throws SQLException;
	
}
