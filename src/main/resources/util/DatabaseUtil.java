package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseUtil {
	public DatabaseUtil()
	{}
	

	public static Connection getConnection() 
	{
		String dbURL = "jdbc:mysql://localhost:8080/trip";
		String dbID = "root";
		String dbPassword = "er181001.";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
			} 
			catch (Exception e) {
				e.printStackTrace();
				e.printStackTrace();
			}return null;
				
	}
	

}
