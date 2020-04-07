package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.io.IOException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
	ConnectionManager con=new ConnectionManager();
	con.getConnection();
		
	}
}
