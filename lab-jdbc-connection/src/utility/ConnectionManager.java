package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionManager {
	

//		Properties prop = loadPropertiesFile();
//		
//		final String driver = prop.getProperty("driver");
//		final String url = prop.getProperty("url");
//		final String user = prop.getProperty("username");
//		final String pass = prop.getProperty("password");
		public static Properties loadPropertiesFile() throws Exception {
	        Properties prop = new Properties();
	        InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	        prop.load(in);
	        in.close();
	        return prop;
	    }


	public Connection getConnection() throws Exception {
		Properties prop = loadPropertiesFile();
		
		final String driver = prop.getProperty("driver");
		final String url = prop.getProperty("url");
		final String user = prop.getProperty("username");
		final String pass = prop.getProperty("password");
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pass);
		
		return con;
	}
	
	
}