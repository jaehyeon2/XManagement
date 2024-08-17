package com.example.project.beans.model;

import java.io.Serializable;

public class CompanyModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int companyNo;
	private String companyName;
	private String companyAddress;
	private String companyZip;
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
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyZip() {
		return companyZip;
	}
	public void setCompanyZip(String companyZip) {
		this.companyZip = companyZip;
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
