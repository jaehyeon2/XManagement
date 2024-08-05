package com.example.project.beans.model;

import java.util.List;

public class ViewModel {
	
	private UserModel user;
	private List<UserModel> userList;
	private DepartmentModel department;
	private List<DepartmentModel> departmentList;
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
}
