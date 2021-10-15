package oop1.entity;

import oop1.interfaces.IDatabase;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 13/10/2021
 **   Time : 3:49 PM
 **/
public class OracleDatabase implements IDatabase {
	@Override public void add() {
		System.out.println("Oracle Value added");
	}

	@Override public void delete() {
		System.out.println("Oracle Value deleted");
	}

	@Override public void get() {
		System.out.println("Oracle Value get");
	}

	@Override public void update() {
		System.out.println("Oracle Value updated");
	}
}
