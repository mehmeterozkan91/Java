package oop1;

import oop1.abstracts.base.AbstractDatabase;
import oop1.abstracts.AbstractMongoDatabase;
import oop1.abstracts.AbstractOracle;
import oop1.configuraitons.DatabaseConfiguraiton;
import oop1.entity.MongodbDatabase;
import oop1.entity.MssqlDatabase;
import oop1.entity.OracleDatabase;
import oop1.manager.DatabaseManager;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 13/10/2021
 **   Time : 12:33 PM
 **/

/*
* Access Levels
Modifier	Class	Package	Subclass	World
public		Y			Y		Y		Y
protected	Y			Y		Y		N
no modifier	Y			Y		N		N
private		Y			N		N		N

* */

public class OOP1 {
	public static void main(String[] args) {
		DatabaseManager databaseManager = new DatabaseManager();
		databaseManager.AddDatabase(new OracleDatabase());
		databaseManager.UpdateDatabase(new MssqlDatabase());
		databaseManager.DeleteDatabase(new MongodbDatabase());
		databaseManager.GetDatabase(new MongodbDatabase());

		System.out.println("Database username: "+DatabaseConfiguraiton.dbUserName);
		System.out.println("Database password: "+DatabaseConfiguraiton.dbPassword);
		DatabaseConfiguraiton databaseConfiguraiton = new DatabaseConfiguraiton();
		System.out.println("Database Name: "+ databaseConfiguraiton.dbName);

		AbstractMongoDatabase abstractMongoDatabase = new AbstractMongoDatabase();
		abstractMongoDatabase.update();
		abstractMongoDatabase.add();
		AbstractDatabase abstractDatabase = new AbstractMongoDatabase();
		abstractDatabase.delete();
		abstractDatabase.add();
		AbstractOracle abstractOracle = new AbstractOracle();
		abstractOracle.get();
		abstractOracle.update();
		abstractOracle.add();
		System.out.println("Database Manager dbCount: "+ DatabaseManager.dbCount);
	}
}
