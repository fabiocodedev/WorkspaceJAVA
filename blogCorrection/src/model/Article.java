package model;

import java.sql.Timestamp;

public class Article {
	private int id ;
	private String titre;
	private String resume;
	private String contenu;
	private Timestamp date;
	private User auteur;
	//CONSTRUCTEURS
	public Article(int id, String titre, String resume, String contenu, Timestamp date, User auteur) {
		super();
		this.id = id;
		this.titre = titre;
		this.resume = resume;
		this.contenu = contenu;
		this.date = date;
		this.auteur = auteur;
	}
	public Article(String titre, String resume, String contenu, Timestamp date, User auteur) {
		super();
		this.titre = titre;
		this.resume = resume;
		this.contenu = contenu;
		this.date = date;
		this.auteur = auteur;
	}
	public Article(String titre, String resume, String contenu, User auteur) {
		super();
		this.titre = titre;
		this.resume = resume;
		this.contenu = contenu;
		this.auteur = auteur;
	}
	//GETTEURS/SETTEURS
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
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public User getAuteur() {
		return auteur;
	}
	public void setAuteur(User auteur) {
		this.auteur = auteur;
	}
}
