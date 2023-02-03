package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import connection.MyConnectionSQL;
import model.User;

public class UserController implements IDAO<User>{
	
// CONNECTION ----------------------------------------------------------------------------------------------------------------------------------------	
	// Cree une variable qui vaut la connection (parametre) et qui sera rapeller pour chaque operation du CCRUD
	Connection paraCo = MyConnectionSQL.getConection();
	
// CREATE --------------------------------------------------------------------------------------------------------------------------------------------
	//Methode CREATE dans un try/catch pour retourner un msg d'erreur si la requete n'aboutit pas !
	@Override
	public Boolean create(User user) {
		try {
			PreparedStatement sql = paraCo.prepareStatement("INSERT INTO user (nom,prenom,email,password,tel) VALUES (?,?,?,PASSWORD(?),?)");
			
			sql.setString(1, user.getNom());
			sql.setString(2, user.getPrenom());
			sql.setString(3, user.getEmail());
			sql.setString(4, user.getPassword());
			sql.setInt(5, user.getTel());
			
			sql.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
	
// READ ----------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public ArrayList<User> read() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	// METHODES -------------------------------------------------------------------------------------------------------------------------------------------
	
	//Methode check mail si il existe
	public boolean isExist(String email) {
		
		try {
			
			PreparedStatement sql = paraCo.prepareStatement("SELECT * FROM user WHERE email =?");
			sql.setString(1,  email);
			
			ResultSet rs = sql.executeQuery();
			if (rs.next()) {
				return true;
			} 
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	//Methode User connecter !
	public User connectionUser(String email, String password) {
		User user = null;
		try {
			PreparedStatement sql = paraCo.prepareStatement("SELECT * FROM user WHERE email =? AND password=PASSWORD(?)");
			sql.setString(1, email);
			sql.setString(2, password);
			
			ResultSet rs = sql.executeQuery();
			if (rs.next()) {
				return new User(rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getInt("tel"),rs.getInt("id"));
			} 
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		return null;
	}

	
// FIN USERCONTROLLER -----------------------------------------------------------------------------------------------------------------------------------	
}
