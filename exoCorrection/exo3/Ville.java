package exo3;

public class Ville {
	public String nom;
	public String departement="Non renseigné";
	/*
	 * MEILLEURE VERSION
		public int departement=75000;
	 */
	public Ville() {
		this.nom="Paris";
		this.departement="75000";
	}
	public Ville(String nom) {
	
		this.nom = nom;
	}
	public Ville(String nom, String departement) {
		
		this.nom = nom;
		this.departement = departement;
	}
	
	public String changeNomVille(String nom) {
		return this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Ville \n[nom=" + nom + ", \n departement=" + departement + "]";
	}
	
}
