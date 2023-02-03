package exo4;

public class Livre {
	
	// ATTRIBUTS
	private String titre ;
	private String auteur ;
	private double prix ;
	
	// METHODES ------------------------------------------------
	
	// CONSTRUCTEURS ----------
	public Livre() {
	}
	
	public Livre(String titre, String auteur, double prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	
	

	// ACCESSEURS GETTEURS AFFICHAGE -----------
	public String getTitre() {
		return titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	public double getPrix() {
		return prix;
	}
	
	// MUTATEURS SETTEURS MODIFICATION -----------
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
	
	// FONCTIONS ----------------
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + "]";
	}

	
	
	
}
