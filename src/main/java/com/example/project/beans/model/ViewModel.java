package com.example.project.beans.model;

import java.util.List;

public class ViewModel {
	
	private UserModel sessionUser;
	
	private UserModel user;
	private List<UserModel> userList;
	private int userCount;
	
	private CompanyModel company;
	private List<CompanyModel> companyList;
	
	private DepartmentModel department;
	private List<DepartmentModel> departmentList;
	
	private int limitNum;
	private int pageNum;
	
	public UserModel getSessionUser() {
		return sessionUser;
	}
	public void setSessionUser(UserModel sessionUser) {
		this.sessionUser = sessionUser;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public List<UserModel> getUserList() {
		return userList;
	}
	public void setUserList(List<UserModel> userList) {
		this.userList = userList;
	}
	public int getUserCount() {
		return userCount;
	}
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	public CompanyModel getCompany() {
		return company;
	}
	public void setCompany(CompanyModel company) {
		this.company = company;
	}
	public List<CompanyModel> getCompanyList() {
		return companyList;
	}
	public void setCompanyList(List<CompanyModel> companyList) {
		this.companyList = companyList;
	}
	public DepartmentModel getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}
	public List<DepartmentModel> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<DepartmentModel> departmentList) {
		this.departmentList = departmentList;
	}
	public int getLimitNum() {
		return limitNum;
	}
	public void setLimitNum(int limitNum) {
		this.limitNum = limitNum;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
}
