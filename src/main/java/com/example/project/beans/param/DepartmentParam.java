package com.example.project.beans.param;

public class DepartmentParam {
	
	private String departmentName;
	private String departmentCode;
	private int departmentParentNo;
	private int companyNo;
	private String adminId;
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public int getDepartmentParentNo() {
		return departmentParentNo;
	}
	public void setDepartmentParentNo(int departmentParentNo) {
		this.departmentParentNo = departmentParentNo;
	}
	public int getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
}
