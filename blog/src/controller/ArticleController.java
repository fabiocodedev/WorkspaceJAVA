package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.MyConnectionSQL;
import model.Article;
import model.User;

public class ArticleController implements IDAO<Article> {

// CONNECTION ----------------------------------------------------------------------------------------------------------------------------------------
	Connection paraCo = MyConnectionSQL.getConection();
	
// CREATE --------------------------------------------------------------------------------------------------------------------------------------------
	@Override
	public Boolean create(Article article) {
		
		try {
			PreparedStatement rqSQL = paraCo.prepareStatement("INSERT INTO article (titre,resume,contenu,date,auteur) VALUES (?,?,?,NOW(),?)");
			
			rqSQL.setString(1, article.getTitre());
			rqSQL.setString(2, article.getResume());
			rqSQL.setString(3, article.getContenu());
			//rqSQL.setString(4, article.getAuteur());
			rqSQL.setInt(4, article.getAuteur().getId());
			
			rqSQL.execute();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}
	
// READ ----------------------------------------------------------------------------------------------------------------------------------------------

@Override
public ArrayList<Article> read() {
	
	ArrayList<Article> listArticle = new ArrayList<>();
	
	User user;
	Article article;

		try {
			PreparedStatement rSQL = paraCo.prepareStatement("SELECT * FROM article "
					+ "INNER JOIN user"
					+ " ON user.id = article.auteur");
			
			//Afficher la requete pour pouvoir la tester dans PHPMyAdmin
			System.out.println(rSQL);
			
			//Stocker le resultat de la requete dans un ResultSet
			ResultSet rs = rSQL.executeQuery();
			
			//.next boucle sur les resultats de la requete,comme un foreach
			//Pour chaque ligne, il execute les instructions jusqu'a plus de ligne
			while (rs.next()) {
				user = new User(rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getInt("id"));
				article = new Article(rs.getString("titre"),rs.getString("resume"),rs.getString("contenu"),rs.getDate("date"),user);
				
				listArticle.add(article);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	return listArticle;
}



// FIN ARTICLECONTROLLER ---------------------------------------------------------------------------------------------------------------------------------	
}
