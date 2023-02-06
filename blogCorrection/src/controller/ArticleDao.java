package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connect.MyConnection;
import model.Article;
import model.User;

public class ArticleDao implements IDao<Article> {

	//Type Connection -> methode getConnect de la class MyConnection
		Connection connect = MyConnection.getConnect();
		
	//Instancier le ResultSet qui est utiliser pour le SELECT (read) et peut etre réutiliser pour d'autres methodes (findBy)
		ResultSet rs = null;
		
	@Override
	public boolean create(Article objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Article> read() {
		//Instancier la collection dans laquelle seront ajouter les articles(+user) via la boucle
		ArrayList<Article> listArticle = new ArrayList<>();
		try {
			PreparedStatement sql = connect.prepareStatement("SELECT * FROM article"
					+ " INNER JOIN user ON article.auteur = user.id");
			rs = sql.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getString("nom"),rs.getString("prenom"),rs.getString("email"));
				Article art = new Article(rs.getString("titre"),rs.getString("resume"),rs.getString("contenu"),rs.getTimestamp("date"),user);
				listArticle.add(art);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listArticle;
	}
}
