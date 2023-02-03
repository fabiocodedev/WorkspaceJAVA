package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connect.MysqlConnection;
import model.User;

public class UserController implements ICRUD<User> {

	Connection myConnect = MysqlConnection.getConnection("localhost","demo","root","");
	
	PreparedStatement sql = null; 
	
	@Override
	public void create(User user) {
		
		try {
			/*
			 * Preparation de la requete SQL 
			 */
			PreparedStatement sql = myConnect.prepareStatement("INSERT INTO user (nom,prenom,email,pwd)"
					+ "VALUES "
					+ "(?,?,?,PASSWORD(?)"
					+ ")");
			
			/*
			 * Recup des inforamtions du user pass� en param (Nom, prenom,email,pwd) via les getters
			 */
			sql.setString(1,user.getNom());
			sql.setString(2,user.getPrenom());
			sql.setString(3,user.getEmail());
			sql.setString(4,user.getPwd());
			
			/*
			 * Execution de la requete
			 */
			sql.execute();
			System.out.println(user.getPrenom() + " a ete bien ajoute");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
			
			System.err.println(user.getPrenom() + " n'a pas ete bien ajoute");
			
			// Pas de retour de RETURN  parce que VOID
		}
	}

	@Override
	public ArrayList<User> read() {
		ArrayList<User> listUser = new ArrayList<>();
		
		try {
			//Recup de tous les informations des user 
			sql =  myConnect.prepareStatement("SELECT * FROM user");
			
			//RS: stock le resultat de la requete SQL
			ResultSet rs = sql.executeQuery();
			
			//Boucle sur chaque elt trouv� dans le ResultSet - equivalent de Foreach
			while(rs.next()) {
				//INSTANTCIATION de chaque user 
				/*
				 * Qui va etre ecraser lors de passage de la boucle 
				 */
				User user = new User(rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getString("pwd"));
				
				//Ajout de l'element instanci�e au dessus dans la liste des users
				listUser.add(user);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Retourne la liste des users ajout�s dans la liste (dans la boucle)
		return listUser;
	}

	@Override
	public boolean update(User user, int id) {
		//public void update(User user, String email) {
		try {
			sql =  myConnect.prepareStatement("UPDATE user SET nom=?, prenom=?,email=?,pwd=PASSWORD(?) WHERE id=?");
			
			/*
			 * Recup des inforamtions du user pass� en param (Nom, prenom,email,pwd) via les getters
			 */
			sql.setString(1,user.getNom());
			sql.setString(2,user.getPrenom());
			sql.setString(3,user.getEmail());
			sql.setString(4,user.getPwd());
			sql.setInt(5,id);
			
			/*
			 * Execution de la requete
			 */
			sql.execute();
			System.out.println(user.getPrenom() + " a ete bien modifi�");
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		try {
			sql =  myConnect.prepareStatement("DELETE FROM user WHERE email=?");
			sql.setString(1,user.getEmail());
			/*
			 * BEST PRACTICES - EMAIL
			 */
			//sql =  myConnect.prepareStatement("DELETE FROM user WHERE email=?");
			
			/*
			 * Execution de la requete
			 */
			sql.execute();
			System.out.println(user.getPrenom() + " a ete bien supprimer");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
