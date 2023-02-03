package model;

public class User {
	private String nom;
	private String prenom;
	private String email;
	private String pwd;
	
	//Ajout id
	private int id;
	
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param id
	 */
	public User(String nom, String prenom, String email, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.id = id;
	}


	public User(String nom, String prenom, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param pwd
	 */
	public User(String nom, String prenom, String email, String pwd) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pwd = pwd;
	}

	public User(int id,String nom, String prenom, String email) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
