package exo1et2;

public class Personne {
	public String nom;
	public String prenom;
	
	public static String email= "test@test.fr";
	
	// Constructeur par défaut
	public Personne() {
		this.nom = "CDA";
		this.prenom = "Afpa";
	}
	

	public Personne(String prenomAchanger) {
		this.prenom = prenomAchanger;
	}

	public Personne(String nomAChanger, String prenomAchanger) {
		
		this.nom = nomAChanger;
		this.prenom = prenomAchanger;
	}
	

	@Override
	public String toString() {
		return "Je m'appelle " +prenom + " " +nom;
	}
	
	
	
	
}










