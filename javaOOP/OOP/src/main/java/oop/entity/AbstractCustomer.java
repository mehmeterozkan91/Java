package oop.entity;

import oop.base.AbstractPerson;
import oop.base.Company;
import oop.base.Person;
import oop.enums.CompanyType;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 12/10/2021
 **   Time : 1:30 PM
 **/
public class AbstractCustomer extends AbstractPerson {
	private String  address;
	private Company company;

	public AbstractCustomer() {
		super();
		this.address = "Pendik, Kurtköy";
		this.company = new Company("Mehmet Beauty Center", CompanyType.BEAUTY);
	}

	public AbstractCustomer(Person p, String address, Company company) {
		this.address = address;
		this.setCompany(company);
	}

	public AbstractCustomer(AbstractCustomer customer) {
		super(customer.getName(), customer.getSurname(), customer.getAge(), customer.getGender(), customer.getIdentificationNumber());
		this.address = customer.getAddress();
		this.setCompany(customer.getCompany());
	}

	public AbstractCustomer(String name, String surname, int age, char gender, String identificationNumber, String address, Company company) {
		super(name, surname, age, gender, identificationNumber);
		this.setAddress(address);
		this.setCompany(company);
	}

	@Override
	public void printInfo(){
		System.out.println("-------- Customer Info ---------------");
		System.out.println("Name : " + this.getName());
		System.out.println("Surname : " + this.getSurname());
		System.out.println("Age : " + this.getAge());
		System.out.println("Gender : " + this.printGender(this.getGender()));
		System.out.println("Identification Number : " + this.getIdentificationNumber());
		System.out.println("Address : " + this.getAddress());
		System.out.println("Company Name : " + this.getCompany().getCompanyName());
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
