package oop.enums;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 12/10/2021
 **   Time : 2:55 PM
 **/
public enum CompanyType {
	RESTORANT("RESTORANT"),
	SPORT("SPORT"),
	BASKET("BASKETBALL"),
	BEAUTY("BEAUTY CENTER");

	String companyType;

	CompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyType() {
		return companyType;
	}
}
