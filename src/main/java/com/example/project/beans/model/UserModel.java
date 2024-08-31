package com.example.project.beans.model;

import java.io.Serializable;
import java.util.Date;

public class UserModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int userNo;
	private String userName;
	private String userEmail;
	private String userPhone;
	private String userPwd;
	private String userAuth;
	private String userPosition;
	private String userResponsibility;
	private String userClass;
	private String userStatus;
	private int userPwdMismatch;
	private Date userConnectTime;
	private String userId;
	private String userDomain;
	private int companyNo;
	private int companyParentNo;
	private String companyParentName;
	private Date insertDate;
	private String adminId;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(String userAuth) {
		this.userAuth = userAuth;
	}
	public String getUserPosition() {
		return userPosition;
	}
	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}
	public String getUserResponsibility() {
		return userResponsibility;
	}
	public void setUserResponsibility(String userResponsibility) {
		this.userResponsibility = userResponsibility;
	}
	public String getUserClass() {
		return userClass;
	}
	public void setUserClass(String userClass) {
		this.userClass = userClass;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public int getUserPwdMismatch() {
		return userPwdMismatch;
	}
	public void setUserPwdMismatch(int userPwdMismatch) {
		this.userPwdMismatch = userPwdMismatch;
	}
	public Date getUserConnectTime() {
		return userConnectTime;
	}
	public void setUserConnectTime(Date userConnectTime) {
		this.userConnectTime = userConnectTime;
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
	public int getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}
	public int getCompanyParentNo() {
		return companyParentNo;
	}
	public void setCompanyParentNo(int companyParentNo) {
		this.companyParentNo = companyParentNo;
	}
	public String getCompanyParentName() {
		return companyParentName;
	}
	public void setCompanyParentName(String companyParentName) {
		this.companyParentName = companyParentName;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
}
