package model;

import java.util.Date;

public class Article {
	
	private String titre;
	private String resume;
	private String contenu;
	private Date date;
	private User auteur;

	
	/**
	 * @param titre
	 * @param resume
	 * @param contenu
	 * @param date
	 * @param auteur
	 */
	public Article(String titre, String resume, String contenu, User auteur) {
		super();
		this.titre = titre;
		this.resume = resume;
		this.contenu = contenu;
		//this.date = date;
		this.auteur = auteur;
	}
	

	/**
	 * @param titre
	 * @param resume
	 * @param contenu
	 * @param date
	 */
	public Article(String titre, String resume, String contenu, Date date) {
		super();
		this.titre = titre;
		this.resume = resume;
		this.contenu = contenu;
		this.date = date;
	}


	/**
	 * @param titre
	 * @param resume
	 * @param contenu
	 * @param date
	 * @param auteur
	 */
	public Article(String titre, String resume, String contenu, Date date, User auteur) {
		super();
		this.titre = titre;
		this.resume = resume;
		this.contenu = contenu;
		this.date = date;
		this.auteur = auteur;
	}


	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getAuteur() {
		return auteur;
	}
	public void setAuteur(User auteur) {
		this.auteur = auteur;
	}
	
	
}
