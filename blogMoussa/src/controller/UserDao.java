package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;
import myConnection.AccesALaBDD;


public class UserDao implements IDao<User>{
	
	Connection connectionALaBDD = AccesALaBDD.getConection();
	
	public static User currentUser ;
	
	//CREATE -----------------------------------------------------------------------------------------------------------------------------------
	@Override
	public Boolean create(User user) {
		try {
			PreparedStatement sql = connectionALaBDD.prepareStatement("INSERT INTO user (nom,prenom,email,pwd) "
					+ "VALUES (?,?,?,PASSWORD(?))");
			
			sql.setString(1, user.getNom());
			sql.setString(2, user.getPrenom());
			sql.setString(3, user.getEmail());
			sql.setString(4, user.getPwd());
			
			sql.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
		}
	}
	//READ -------------------------------------------------------------------------------------------------------------------------------------
	

	public ArrayList<User> read() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// METHODES --------------------------------------------------------------------------------------------------------------------------------
	
	/*
	 * Check si le mail passé en param existe dans la BDD
	 * Cette méthide retourne TRUE sil existe sinon elle retourne FALSE
	 */
	public Boolean isExist(String email) {
		
		try {
			PreparedStatement sql = connectionALaBDD.prepareStatement("SELECT * FROM user WHERE email=?");//test@test.fr
			
			sql.setString(1, email);
			
			ResultSet rs = sql.executeQuery();
			
			System.out.println(rs.getRow());
			
			if (rs.next()) {
				return true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public User connection(String email, String pwd) {
		try {
			PreparedStatement sql = connectionALaBDD.prepareStatement("SELECT * FROM user WHERE email=? AND pwd=PASSWORD(?)");
			
			sql.setString(1, email);
			sql.setString(2, pwd);
			
			System.out.println(sql);
			ResultSet rs = sql.executeQuery();
			if (rs.next()) {
				//user.setNom(rs.getString("nom"));
				//user = new User(rs)
				//return new User(rs.getString("nom"),rs.getString("prenom"),email,pwd);
				currentUser = new User(rs.getInt("id"),rs.getString("nom"),rs.getString("prenom"),rs.getString("email"));
				//currentUser = userLogged;
				System.out.println(currentUser);
				return currentUser;
				//return new User(rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),pwd);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	

}
