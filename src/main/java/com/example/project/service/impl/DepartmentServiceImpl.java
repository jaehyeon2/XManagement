package com.example.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.beans.model.DepartmentModel;
import com.example.project.beans.param.DepartmentParam;
import com.example.project.service.BaseService;
import com.example.project.service.DepartmentService;

@Service
public class DepartmentServiceImpl extends BaseService implements DepartmentService{

	@Override
	public boolean istDepartmentService(DepartmentParam departmentParam) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean udtDepartmentService(DepartmentParam departmentParam) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean dltDepartmentService(DepartmentParam departmentParam) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public DepartmentModel sltDepartment(DepartmentParam departmentParam) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DepartmentModel> sltDepartmentList(DepartmentParam departmentParam) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
