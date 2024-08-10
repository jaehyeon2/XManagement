package com.example.project.beans.param;

public class LoginUserParam extends BaseParam{
	
	private String userEmail;
	private String userPwd;
	private int userPwdMiscount;
	private String userId;
	private String userDomain;
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getUserPwdMiscount() {
		return userPwdMiscount;
	}
	public void setUserPwdMiscount(int userPwdMiscount) {
		this.userPwdMiscount = userPwdMiscount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserDomain() {
		return userDomain;
	}
	public void setUserDomain(String userDomain) {
		this.userDomain = userDomain;
	}
}
