package oop1.entity;

import oop1.interfaces.IDatabase;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 13/10/2021
 **   Time : 3:47 PM
 **/
public class MongodbDatabase implements IDatabase {
	@Override public void add() {
		System.out.println("Mongodb Value added");
	}

	@Override public void delete() {
		System.out.println("Mongodb Value deleted");
	}

	@Override public void get() {
		System.out.println("Mongodb Value get");
	}

	@Override public void update() {
		System.out.println("Mongodb Value updated");
	}
}
