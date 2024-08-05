package com.example.project.service;

import com.example.project.beans.model.CompanyModel;
import com.example.project.beans.param.CompanyParam;

public interface CompanyService {
	
//	Master
	public boolean istCompany(CompanyParam companyParam) throws Exception;
	public boolean udtCompany(CompanyParam companyParam) throws Exception;
	public boolean dltCompany(CompanyParam companyParam) throws Exception;
	
//	Slave
	public CompanyModel sltCompany(CompanyParam companyParam) throws Exception;
	
}
