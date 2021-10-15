package oop1.abstracts;

import oop1.abstracts.base.AbstractDatabase;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 14/10/2021
 **   Time : 11:45 AM
 **/
public class AbstractOracle extends AbstractDatabase {
	@Override public void get() {
		System.out.println("oracle get");
	}

	@Override public void update() {
		System.out.println("oracle update");
	}
}
