package com.example.project.dao.slave;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.example.project.beans.model.DepartmentModel;

public interface SDepartmentDao {

	public DepartmentModel sltDepartment(Map<String, Object> map) throws SQLException;
	public List<DepartmentModel> sltDepartmentList(Map<String, Object> map) throws SQLException;
	
}
