package oop.entity;

import oop.base.Person;

import java.util.Date;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 12/10/2021
 **   Time : 3:01 PM
 **/
public class Subscription extends Person {
	private Date createDate;

	public Subscription(String name, String surname, int age, char gender, String identificationNumber, Date createDate) {
		super(name, surname, age, gender, identificationNumber);
		this.createDate = createDate;
	}

	public Subscription(Person p, Date createDate) {
		super(p);
		this.createDate = createDate;
	}

	public Subscription(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public void printInfo(){
		System.out.println("-------- Subscription Info ---------------");
		System.out.println("Name : " + this.getName());
		System.out.println("Surname : " + this.getSurname());
		System.out.println("Age : " + this.getAge());
		System.out.println("Gender : " + this.printGender(this.getGender()));
		System.out.println("Identification Number : " + this.getIdentificationNumber());
		System.out.println("Create Date : " + this.getCreateDate());
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
