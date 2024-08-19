package com.example.project.service;

import java.util.List;

import com.example.project.beans.model.CompanyModel;
import com.example.project.beans.param.CompanyParam;

public interface CompanyService {
	
//	Master
	public boolean istCompany(CompanyParam companyParam) throws Exception;
	public boolean udtCompany(CompanyParam companyParam) throws Exception;
	public boolean dltCompany(CompanyParam companyParam) throws Exception;
	
//	Slave
	public CompanyModel sltCompany(CompanyParam companyParam) throws Exception;
	public List<CompanyModel> sltCompanyList(CompanyParam companyParam) throws Exception;
	public List<CompanyModel> sltLowerCompanyList(CompanyParam companyParam) throws Exception;
}
