package oop.base;

import oop.enums.CompanyType;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 12/10/2021
 **   Time : 2:39 PM
 **/
public class Company {
	private String companyName;
	private CompanyType companyType;

	public Company(String companyName, CompanyType companyType) {
		this.companyName = companyName;
		this.companyType = companyType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public CompanyType getCompanyType() {
		return companyType;
	}

	public void setCompanyType(CompanyType companyType) {
		this.companyType = companyType;
	}
}
