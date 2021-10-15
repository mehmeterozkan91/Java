package oop1.abstracts;

import oop1.abstracts.base.AbstractDatabase;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 13/10/2021
 **   Time : 4:10 PM
 **/
public class AbstractMongoDatabase extends AbstractDatabase {

	@Override public void get() {
		System.out.println("Mongo get");
	}

	@Override public void update() {
		System.out.println("Mongo update");
	}

}
