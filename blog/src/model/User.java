package model;

public class User {
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private int tel;
	//Ajout de l'attribut id
	private int id;

	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param password
	 * @param tel
	 * @param id
	 */
	public User(String nom, String prenom, String email, String password, int tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.tel = tel;
	}
	

	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param tel
	 */
	public User(String nom, String prenom, String email, int tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
	}


	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param password
	 * @param tel
	 * @param id
	 */
	public User(String nom, String prenom, String email, int tel, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
