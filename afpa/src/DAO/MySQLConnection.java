/**
 * 
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author bourg
 *
 */
public class MySQLConnection {

	
	public static Connection getConnection() {
		Connection conn = null;
		/**
		 * Information de connection, pour connecter l'app a la BDD
		 */
		String nameBDD = "test";
		String url = "jdbc:mysql://localhost:3306/" + nameBDD;
		String user = "root";
		String pwd = "";
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connection KO...");
		}
		
		return conn;

	}

}
