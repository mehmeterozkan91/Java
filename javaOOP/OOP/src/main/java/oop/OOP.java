package oop;

import oop.base.Company;
import oop.base.Person;
import oop.entity.AbstractCustomer;
import oop.entity.Customer;
import oop.entity.Subscription;
import oop.enums.CompanyType;

import java.util.Date;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 12/10/2021
 **   Time : 2:15 PM
 **/
public class OOP {
	public static void main(String[] args) {
		Person person = new Person("Ahmet", "BEŞİKTAŞ", 28, 'M', "15255597");
		Person person1 = new Person("Mehmet", "ERÖZKAN", 29, 'M', "25785476");
		Person person2 = new Person("Zeynep", "ERÖZKAN", 19, 'F', "95478569");
		Person person3 = new Person("John", "SMITH", 39, 'O', "AB-745889E84");
		Customer customer = new Customer(person1, "Kartal, ISTANBUL", new Company("Hakan Beauty", CompanyType.BEAUTY));
		Customer customer1 = new Customer(person3, "Atlanta, ABD", new Company("Fit Fitness", CompanyType.SPORT));
		Subscription subscription = new Subscription(customer,new Date());

		printInfo(person);
		printInfo(customer);
		printInfo(customer1);
		printInfo(subscription);

		person.printInfo();
		customer.printInfo();
		subscription.printInfo();

		AbstractCustomer customer2 = new AbstractCustomer("Ali", "DENIZ", 28, 'M', "15255597", "Kartal, ISTANBUL", new Company("Hakan Beauty", CompanyType.BEAUTY));
		customer2.printInfo();
	}

	public static void printInfo(Object o) {
		System.out.println("--------------------------");
		if (o instanceof Customer) {
			Customer customer = (Customer) o;
			System.out.println("Name : " + customer.getName());
			System.out.println("Surname : " + customer.getSurname());
			System.out.println("Age : " + customer.getAge());
			System.out.println("Gender : " + customer.printGender(customer.getGender()));
			System.out.println("Identification Number : " + customer.getIdentificationNumber());
			System.out.println("Address : " + customer.getAddress());
			System.out.println("Company Name : " + customer.getCompany().getCompanyName() + "\nCompany Type: " + customer.getCompany().getCompanyType().getCompanyType());
		}else if (o instanceof Subscription) {
			Subscription subscription = (Subscription) o;
			System.out.println("Name : " + subscription.getName());
			System.out.println("Surname : " + subscription.getSurname());
			System.out.println("Age : " + subscription.getAge());
			System.out.println("Gender : " + subscription.printGender(subscription.getGender()));
			System.out.println("Identification Number : " + subscription.getIdentificationNumber());
			System.out.println("CreateDate : " + subscription.getCreateDate());
		} else if (o instanceof Person) {
			Person person = (Person) o;
			System.out.println("Name : " + person.getName());
			System.out.println("Surname : " + person.getSurname());
			System.out.println("Age : " + person.getAge());
			System.out.println("Gender : " + person.printGender(person.getGender()));
			System.out.println("Identification Number : " + person.getIdentificationNumber());
		}
	}
}
