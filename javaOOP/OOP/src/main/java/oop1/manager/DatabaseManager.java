package oop1.manager;

import oop1.interfaces.IDatabase;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 13/10/2021
 **   Time : 3:48 PM
 **/
public class DatabaseManager {
	public static int dbCount =0;

	public DatabaseManager(){
		dbCount++;
	}

	public void AddDatabase(IDatabase iDatabase){
		iDatabase.add();
	}
	public void DeleteDatabase(IDatabase iDatabase){
		iDatabase.delete();
	}
	public void UpdateDatabase(IDatabase iDatabase){
		iDatabase.update();
	}
	public void GetDatabase(IDatabase iDatabase){
		iDatabase.get();
	}
}
