package com.example.project.service.impl;

import org.springframework.stereotype.Service;

import com.example.project.beans.model.CompanyModel;
import com.example.project.beans.param.CompanyParam;
import com.example.project.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Override
	public boolean istCompany(CompanyParam companyParam) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean udtCompany(CompanyParam companyParam) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean dltCompany(CompanyParam companyParam) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public CompanyModel sltCompany(CompanyParam companyParam) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
