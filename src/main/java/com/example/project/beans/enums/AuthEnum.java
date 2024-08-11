package com.example.project.beans.enums;

public enum AuthEnum {
	SUPER("0", "1", "슈퍼관리자권한"),
	MIDDLE("5", "1", "관리자권한"),
	GENERAL("9", "0", "일반권한");
	
	private String authCode;
	private String authAdmin;
	private String authName;
	
	private AuthEnum(String authCode, String authAdmin, String authName){
		this.authCode = authCode;
		this.authAdmin = authAdmin;
		this.authName = authName;
	}
	
	public String getAuthCode() {
		return authCode;
	}
	
	public String getAuthAdmin() {
		return authAdmin;
	}
	
	public String getAuthName() {
		return authName;
	}
	
	public static String getAuthCode(String authName){
		for (AuthEnum auth : AuthEnum.values()) {
			if (auth.getAuthName().equals(authName)) {
				return auth.getAuthCode();
			}
		}
		return null;
	}
	
	public static boolean isAdmin(String authCode){
		
		for (AuthEnum auth : AuthEnum.values()) {
			if (auth.getAuthCode().equals(authCode) && auth.getAuthAdmin().equals("1")) {
				return true;
			}
		}
		return false;
	}
}
