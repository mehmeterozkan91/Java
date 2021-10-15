package oop1.abstracts.base;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 13/10/2021
 **   Time : 4:08 PM
 **/
public abstract class AbstractDatabase {
	public void add(){
		System.out.println("Added");
	}

	public void delete(){
		System.out.println("deleted");
	}

	public abstract void get();
	public abstract void update();
}
