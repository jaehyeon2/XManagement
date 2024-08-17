package com.example.project.service;

import java.util.List;

import com.example.project.beans.model.DepartmentModel;
import com.example.project.beans.param.DepartmentParam;

public interface DepartmentService {

//	Master
	public boolean istDepartmentService(DepartmentParam departmentParam) throws Exception;
	public boolean udtDepartmentService(DepartmentParam departmentParam) throws Exception;
	public boolean dltDepartmentService(DepartmentParam departmentParam) throws Exception;
	
//	Slave
	public DepartmentModel sltDepartment(DepartmentParam departmentParam) throws Exception;
	public List<DepartmentModel> sltDepartmentList(DepartmentParam departmentParam) throws Exception;
	
}
