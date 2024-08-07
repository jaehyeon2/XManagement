package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.beans.MasterBean;
import com.example.project.beans.param.CompanyParam;

@Service
public class MasterService extends BaseService{
	
	@Autowired
	private MasterBean masterBean;
	
	@Autowired
	private CompanyService companyService;
	
	public MasterService() throws Exception{
	}
	
	public void start() throws Exception{
		this.setMCompany();
	}
	
	public void stop() throws Exception{
		logger.info("stop");
	}
	
	private void setMCompany() throws Exception{
		CompanyParam companyParam = new CompanyParam();
		companyParam.setCompanyCode("company-001");
		
		masterBean.setCompany(companyService.sltCompany(companyParam));
		
	}

}
