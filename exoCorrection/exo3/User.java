package exo3;

public class User {
	
	private String nom;
	
	public String prenom;
	
	
	
	public Roles role;

	public User(String nom, String prenom, Roles role) {
		this.nom = nom;
		this.prenom = prenom;
		this.role = role;
	}

	
	public String getNom() {
		return nom;
	}


	public void setNom(String nomA) {
		this.nom = nomA;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String manger() {
		return "Bon ap!";
	}


	
}
