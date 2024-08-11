package com.example.project.dao.slave;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.project.beans.model.CompanyModel;

@Repository
public interface SCompanyDao {
	
	public CompanyModel sltCompany(Map<String, Object> map) throws SQLException;
	
	public List<CompanyModel> sltCompanyList(Map<String, Object> map) throws SQLException;
	
}
