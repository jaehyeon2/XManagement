package com.example.project.beans.model;

import java.io.Serializable;
import java.util.Date;

public class CompanyModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int companyNo;
	private String companyName;
	private String companyCode;
	private int companyParentNo;
	private String companyParentName;
	private Date insertDate;
	
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
}
