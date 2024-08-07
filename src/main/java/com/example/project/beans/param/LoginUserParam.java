package com.example.project.beans.param;

public class LoginUserParam extends BaseParam{
	
	private String userEmail;
	private String userPwd;
	private int userPwdMiscount;
	
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
}
