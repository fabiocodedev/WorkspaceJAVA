package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connect.MyConnection;
import model.User;

public class UserDao implements IDao<User> {
	//Type Connection -> methode getConnect de la class MyConnection
	Connection connect = MyConnection.getConnect();
	
	ResultSet rs = null;
	
	@Override
	public boolean create(User user) {
		//Mettre dans la base de donnée -> persister !
		String maRequete = "INSERT INTO user (nom,prenom,email,password) "
				+ "VALUES (?,?,?,PASSWORD(?));";
		try {
			PreparedStatement sql = connect.prepareStatement(maRequete);
			sql.setString(1,  user.getNom());
			sql.setString(2,  user.getPrenom());
			sql.setString(3,  user.getEmail());
			sql.setString(4,  user.getPassword());
			sql.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<User> read() {
		// TODO Auto-generated method stub
		return null;
	}

	//METHODES SUPP
	/*
     * Check si le mail passé en param existe dans la BDD
     * Cette méthide retourne TRUE sil existe sinon elle retourne FALSE
     */
    public Boolean isExist(String email) {
        try {
            PreparedStatement sql = connect.prepareStatement("SELECT FROM user WHERE email=?");//test@test.fr
            sql.setString(1, email);
            rs = sql.executeQuery();
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
}
