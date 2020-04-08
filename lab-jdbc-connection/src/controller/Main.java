package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception  {
			
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		if(con!=null) {
			System.out.println("Success");
		}
		else {
			System.out.println("No");
		}
		
	}
}