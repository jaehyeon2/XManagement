package com.example.project.beans.param;

public class CompanyParam extends BaseParam{

	private int companyNo;
	private String companyName;
	private String companyCode;
	private int companyParentNo;
	
	public int getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public int getCompanyParentNo() {
		return companyParentNo;
	}
	public void setCompanyParentNo(int companyParentNo) {
		this.companyParentNo = companyParentNo;
	}
}
