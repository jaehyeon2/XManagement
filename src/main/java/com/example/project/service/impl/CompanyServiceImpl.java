package com.example.project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.project.beans.model.CompanyModel;
import com.example.project.beans.param.CompanyParam;
import com.example.project.dao.master.MCompanyDao;
import com.example.project.dao.slave.SCompanyDao;
import com.example.project.service.BaseService;
import com.example.project.service.CompanyService;

@Service
public class CompanyServiceImpl extends BaseService implements CompanyService{

	@Override
	public boolean istCompany(CompanyParam companyParam) throws Exception {
		int intResult = 0;
		try{
			Map<String, Object> map = new HashMap<>();
			map.put("companyName", companyParam.getCompanyName());
			map.put("companyAddress", companyParam.getCompanyAddress());
			map.put("companyZip", companyParam.getCompanyZip());
			map.put("companyCode", companyParam.getCompanyCode());
			map.put("companyParentNo", companyParam.getCompanyNo());
			map.put("adminId", companyParam.getAdminId());
			
			intResult = mDbDao.getMapper(MCompanyDao.class).istCompany(map);
			
			if(intResult<1){
				logger.error("CompanyServiceImpl::istCompany::Error = insert company is fail, companyName = {}", companyParam.getCompanyName());
				return false;
			}
		}catch (Exception e) {
			logger.error("CompanyServiceImpl::istCompany::Error = {}", e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public boolean udtCompany(CompanyParam companyParam) throws Exception {
		int intResult = 0;
		try{
			Map<String, Object> map = new HashMap<>();
			map.put("companyName", companyParam.getCompanyName());
			map.put("companyAddress", companyParam.getCompanyAddress());
			map.put("companyZip", companyParam.getCompanyZip());
			map.put("companyCode", companyParam.getCompanyCode());
			map.put("companyParentNo", companyParam.getCompanyNo());
			
			intResult = mDbDao.getMapper(MCompanyDao.class).udtCompany(map);
			
			if(intResult<1){
				logger.error("CompanyServiceImpl::udtCompany::Error = udt company is fail");
				return false;
			}
		}catch (Exception e) {
			logger.error("CompanyServiceImpl::udtCompany::Error = {}", e.getMessage());
			return false;
		}
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
	
	@Override
	 public List<CompanyModel> sltCompanyList(CompanyParam companyParam) throws Exception {
		List<CompanyModel> companyList = null;
		
		try{
			Map<String, Object> map = new HashMap<>();
			map.put("companyParentNo", companyParam.getCompanyNo());
			
			companyList = sDbDao.getMapper(SCompanyDao.class).sltCompanyList(map);
			if (companyList == null){
				logger.info("CompanyServiceImpl::sltCompanyList::Info = companyList is null");
			}
			
		}catch (Exception e) {
			logger.error("CompanyServiceImpl::sltCompanyList::Error = {}", e.getMessage());
			return null;
		}
		return companyList;
	}

}
