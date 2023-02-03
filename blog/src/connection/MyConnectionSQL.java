package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionSQL {
	
	// Cree la methode connection (le type "connection" est un mot cle !
	public static Connection getConection(){
		//Cree une variable de type "connection" pour la rapeller a la fin
		Connection myCo = null;
				// Info de connection a la BDD
				String url = "jdbc:mysql://localhost/";
				String dbName = "blog";
				String user="root";
				String pwd="";
				
				try {
					// Pointer vers le driver !
					Class.forName("com.mysql.cj.jdbc.Driver");
					myCo = DriverManager.getConnection(url + dbName,user,pwd);
					// Dire au "manager driver" sde se connecter a la bdd avec les infos fournis !
					System.out.println("OK for connect");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return myCo;
	}
}
