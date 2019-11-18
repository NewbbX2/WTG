package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseUtil {
	public DatabaseUtil()
	{}
	

	public static Connection getConnection() 
	{
		String dbURL = "jdbc:mysql://로컬호스트:8080";//다른곳 지정시 알아서
		String dbID = "아이디";
		String dbPassword = "비밀번호";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
			} catch (Exception e) {
			e.printStackTrace();
			}return null;
				
	}
	

}
