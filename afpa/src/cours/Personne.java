package cours;

public class Personne {
	public String nom = "indefined" ;
	public String prenom = "indefined" ;
	public static String email = "test@123.fr" ;
	
	
	// Constructeur par defaut !
	public Personne() {
	}

	public Personne(String nomAChanger, String prenomAChanger) {
		this.nom = nomAChanger;
		this.prenom = prenomAChanger;
	}
	
	public Personne(String nomAChanger) {
		this.prenom = nomAChanger;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

	



	
}
