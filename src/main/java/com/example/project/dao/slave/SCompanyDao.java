package com.example.project.dao.slave;

import java.sql.SQLException;
import java.util.Map;

import com.example.project.beans.model.CompanyModel;

public interface SCompanyDao {
	
	public CompanyModel sltCompany(Map<String, Object> map) throws SQLException;
	
}
