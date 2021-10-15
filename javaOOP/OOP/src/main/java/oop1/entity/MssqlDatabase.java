package oop1.entity;

import oop1.interfaces.IDatabase;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 13/10/2021
 **   Time : 3:46 PM
 **/
public class MssqlDatabase implements IDatabase {
	@Override public void add() {
		System.out.println("Mssql Value added");
	}

	@Override public void delete() {
		System.out.println("Mssql Value deleted");
	}

	@Override public void get() {
		System.out.println("Mssql Value get");
	}

	@Override public void update() {
		System.out.println("Mssql Value updated");
	}
}
