package oop.base;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 12/10/2021
 **   Time : 1:16 PM
 **/
public class Person {
	private String name;
	private String surname;
	private int    age;
	private char   gender;
	private String identificationNumber;

	public Person(String name, String surname, int age, char gender, String identificationNumber) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.setIdentificationNumber(identificationNumber);
	}

	public Person(Person p) {
		this.name = p.name;
		this.surname = p.surname;
		this.setAge(p.getAge());
		this.setGender(p.gender);
		this.identificationNumber=p.identificationNumber;
	}

	public Person() {
		this.name = "Mehmet";
		this.surname = "ERÖZKAN";
		this.age = 29;
		this.gender = 'M';
		this.setIdentificationNumber("123456789");
	}

	public void printInfo(){
		System.out.println("-------- Person Info ---------------");
		System.out.println("Name : " + this.getName());
		System.out.println("Surname : " + this.getSurname());
		System.out.println("Age : " + this.getAge());
		System.out.println("Gender : " + this.printGender(this.getGender()));
		System.out.println("Identification Number : " + this.getIdentificationNumber());
	}

	public static String printGender(char gender){
		if(gender=='M')
			return "Male";
		else if(gender=='F')
			return "Famale";
		else
			return "Other";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
}
