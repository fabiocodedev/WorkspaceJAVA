package model;

import java.sql.Date;

public class Commentaire {
	private int id;
	private String titre;
	private String corps;
	private Date date;
	private Article article;
	private User auteur;
	/**
	 * @param id
	 * @param titre
	 * @param corps
	 * @param date
	 * @param article
	 * @param auteur
	 */
	public Commentaire(int id, String titre, String corps, Article article, User auteur) {
		super();
		this.id = id;
		this.titre = titre;
		this.corps = corps;
		this.article = article;
		this.auteur = auteur;
	}
	/**
	 * @param titre
	 * @param corps
	 * @param date
	 * @param article
	 * @param auteur
	 */
	public Commentaire(String titre, String corps, Date date, Article article, User auteur) {
		super();
		this.titre = titre;
		this.corps = corps;
		this.date = date;
		this.article = article;
		this.auteur = auteur;
	}
	
	/**
	 * @param titre
	 * @param corps
	 * @param article
	 * @param auteur
	 */
	public Commentaire(String titre, String corps, Article article, User auteur) {
		super();
		this.titre = titre;
		this.corps = corps;
		this.article = article;
		this.auteur = auteur;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getCorps() {
		return corps;
	}
	public void setCorps(String corps) {
		this.corps = corps;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public User getAuteur() {
		return auteur;
	}
	public void setAuteur(User auteur) {
		this.auteur = auteur;
	}
	
	
}
