package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Article;
import model.User;
import myConnection.AccesALaBDD;

public class ArticleDao implements IDao<Article> {

	Connection connectionALaBDD = AccesALaBDD.getConection();
	
	
	//CREATE -----------------------------------------------------------------------------------------------------------------------------------
	@Override
	public Boolean create(Article article) {

		try {
			
			
			PreparedStatement sql = connectionALaBDD.prepareStatement("INSERT INTO article (titre,resume,contenu,date,auteur) "
					+ "VALUES (?,?,?,NOW(),?)");
			
			sql.setString(1,article.getTitre());
			sql.setString(2,article.getResume());
			sql.setString(3,article.getContenu());
			/*
			 * Si on souhaite passé par l'object us
			 */
			sql.setInt(4,article.getAuteur().getId());
			
			System.out.println(sql);
			/*
			 * Si souhaite passé par le mail du user
			 */
			//sql.setString(4,article.getAuteur().getEmail());
			
			sql.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	//READ -------------------------------------------------------------------------------------------------------------------------------------
	public ArrayList<Article> read() {
		ArrayList<Article> listeArticle = new ArrayList<>();
		
		try {
			PreparedStatement req = connectionALaBDD.prepareStatement("SELECT * FROM article"
					+ " INNER JOIN user"
					+ " ON user.id = article.auteur ");
			
			//Affichage la requete pour pouvoir la tester dans phpMyAdmin
			System.out.println(req);
			ResultSet rs = req.executeQuery();
			
			while(rs.next()) {
				User user = new User(rs.getInt("id"),rs.getString("nom"), rs.getString("prenom"), 
						rs.getString("email")
                        );

               Article article = new Article(rs.getInt("id"),rs.getString("titre"), rs.getString("resume"), 
                		rs.getString("contenu"), rs.getDate("date"),user);
               
               listeArticle.add(article);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeArticle;
        
    }
	
	// METHODES --------------------------------------------------------------------------------------------------------------------------------
	public Article findById(int id) {
		Article article=null;
		try {
			PreparedStatement req = connectionALaBDD.prepareStatement("SELECT * FROM article INNER JOIN user"+
					" ON user.id=article.auteur WHERE article.id=?");
			req.setInt(1, id);
			
			ResultSet rs = req.executeQuery();
			if(rs.next()) {
				User user = new User(rs.getInt("id"),rs.getString("nom"), rs.getString("prenom"), 
						rs.getString("email")
                        );

                article = new Article( id,rs.getString("titre"), rs.getString("resume"), 
                		rs.getString("contenu"), rs.getDate("date"),user);
               
			}
			//System.out.println(listearticle);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO - KO - KO");
		}
		return article;
	}

}






















