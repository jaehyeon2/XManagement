package com.example.project.dao.master;

import java.sql.SQLException;
import java.util.Map;

public interface MCompanyDao {

	public int istCompany(Map<String, Object> map) throws SQLException;
	public int udtCompany(Map<String, Object> map) throws SQLException;
	public int dltCompany(Map<String, Object> map) throws SQLException;
	
}
