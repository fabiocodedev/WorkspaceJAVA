package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDAO {

	public static void main(String[] args) {
		
		Connection co  = MySQLConnection.getConnection();

		try {
			Statement stm = co.createStatement();
			//CREATION TABLE
			String sqlCreateTable = "CREATE OR REPLACE TABLE dao" 
			+ "(id int PRIMARY KEY AUTO_INCREMENT,"
			+ "nom VARCHAR(20),"
			+ "prenom VARCHAR(20),"
			+ "mail VARCHAR(20),"
			+ "password VARCHAR(255))";
			//VOIR SQL
			System.out.println(sqlCreateTable);
			//CREE TABLE
			stm.executeUpdate(sqlCreateTable);
			//AJOUTER UNE PERSONNE -----------------------------------------------------------------------------------------------
//			stm.executeUpdate("INSERT INTO testT (nom,prenom,mail,password) VALUES "
//					+ "('bourgin','fabien','test@test.fr','azerty'),"
//					+ "('yvars','val','test@test.fr','azerty'),"
//					+ "('gator','bob','test@test.fr','azerty')"
//					);
			//PREPARESTATEMENT
			//PREPARATION DE LA REQUETE INSERT INTO
			PreparedStatement pstm = co.prepareStatement("INSERT INTO dao (nom,prenom,mail,password) VALUES "
					+ "(?,?,?,PASSWORD(?))"
					);
			//pstm.setInt(0, 5);
			pstm.setString(1,"bourgin");
			pstm.setString(2,"fabien");
			pstm.setString(3,"test.test.fr");
			pstm.setString(4,"azerty");
			
			//System.out.println(pstm);
			//EXECUTION DE LA REQUETE
			pstm.executeUpdate();
			
			//SELECT --------------------------------------------------------------------------------------------------------
//			ResultSet retourInfoN = stm.executeQuery("SELECT * FROM testt");
//			while (retourInfoN.next()) {
//					System.err.println(retourInfoN.getString("nom"));
//			}
//			//SELECT
//			ResultSet retourInfoP = stm.executeQuery("SELECT * FROM testt");
//			while (retourInfoP.next()) {
//				System.err.println(retourInfoP.getString("prenom"));
//			}
			//SELECT VIA PREPAREDSTATEMENT
			//PREPARE (instancier) LA REQUETE
			PreparedStatement requete = co.prepareStatement("SELECT * FROM dao WHERE mail=? AND password=PASSWORD(?);");
			
					System.out.println(requete);
			requete.setString(1,"test.test.fr");
			requete.setString(2,"azerty");
			//EXECUTER LA REQUETE
			ResultSet resultatRequete = requete.executeQuery();
			while (resultatRequete.next()) {
				System.err.println(resultatRequete.getString("password"));
				//System.err.println((resultatRequete.getString("email"),(resultatRequete.getString("password")));
		}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
