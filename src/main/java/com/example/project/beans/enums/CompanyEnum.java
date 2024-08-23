package com.example.project.beans.enums;

public enum CompanyEnum {

	WAITING("대기", 5);
	
	private String name;
	private int companyNo;
	
	private CompanyEnum(String name, int companyNo){
		this.name = name;
		this.companyNo = companyNo;
	}

	public String getName() {
		return name;
	}
	public int getCompanyNo() {
		return companyNo;
	}
}
