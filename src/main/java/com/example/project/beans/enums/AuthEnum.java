package com.example.project.beans.enums;

public enum AuthEnum {
	SUPER("0", "슈퍼관리자권한"),
	MIDDLE("5", "관리자권한"),
	GENERAL("9", "일반권한");
	
	private String authCode;
	private String authName;
	
	private AuthEnum(String authCode, String authName){
		this.authCode = authCode;
		this.authName = authName;
	}
	
	public String getAuthCode() {
		return authCode;
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
}
