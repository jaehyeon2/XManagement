package com.example.project.beans.enums;

public enum LoginResultEnum {

	SUCCESS("1"),
	MISMATCH("3"),
	NOTEXIST("5"),
	BLOCK("7"),
	ERROR("9");
	
	private String value;
	
	private LoginResultEnum(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
