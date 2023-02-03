package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import model.Article;
import model.Commentaire;
import model.User;
import myConnection.AccesALaBDD;

public class CommDAO implements IDao<Commentaire> {

	Connection connectionALaBDD = AccesALaBDD.getConection();
	
	//CREATE -----------------------------------------------------------------------------------------------------------------------------------
	@Override
	public Boolean create(Commentaire Commentaire) {
		
		try {
			PreparedStatement sql = connectionALaBDD.prepareStatement("INSERT INTO commentaire (titre,corps,date,article,auteur) "
					+ "VALUES (?,?,NOW(),?,?)");

			
					sql.setString(1, Commentaire.getTitre());
					sql.setString(2, Commentaire.getCorps());
					sql.setInt(3, Commentaire.getArticle().getId());
					sql.setInt(4, Commentaire.getAuteur().getId());
					
					sql.execute();
			
			
					} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	//READ -------------------------------------------------------------------------------------------------------------------------------------
	@Override
	public ArrayList<Commentaire> read() {
		
		ArrayList<Commentaire> listComm = new ArrayList<>();
		
		try {
			PreparedStatement sql = connectionALaBDD.prepareStatement("SELECT * FROM commentaire"
					+ "INNER JOIN article ON commentaire.article = article.id "
					+ "INNER JOIN user ON commentaire.auteur = user.id");
			
			ResultSet rs = sql.executeQuery();
			
			while (rs.next()) {
				User user = new User(rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getInt("id"));
				Article article = new Article(rs.getString("titre"),rs.getString("resume"),rs.getString("contenu"),rs.getDate("date"),user);
				Commentaire commentaire = new Commentaire(rs.getString("titre"),rs.getString("corps"),rs.getDate("date"),article,user);
				
				listComm.add(commentaire);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listComm;
	}


	// METHODES --------------------------------------------------------------------------------------------------------------------------------
	
	
	
}
