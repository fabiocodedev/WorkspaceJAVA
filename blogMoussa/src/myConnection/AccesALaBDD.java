package myConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccesALaBDD{

	public static Connection getConection() {
		Connection myConnection = null;
		
		String url = "jdbc:mysql://localhost/";
		String dbName = "blogmoussa";
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			myConnection = DriverManager.getConnection(url+dbName,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myConnection;
	}
}
