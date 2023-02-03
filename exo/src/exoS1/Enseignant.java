package exoS1;
	// CLASS
public class Enseignant {
	// ATTRIBUTS
	private String nom;
	private String prenom;
	private Specialiter spe;
	// CONSTRUCTEUR
	public Enseignant(String nom, String prenom, Specialiter spe) {
		this.nom = nom;
		this.prenom = prenom;
		this.spe = spe;
	}
	// GETTERS
public String getNom() {
	return nom;
}
public String getPrenom() {
	return prenom;
}
public Specialiter getSpe() {
	return spe;
}
	// METHODE TOSTRING
	@Override
	public String toString() {
		return nom + " " + prenom + " " + spe;
}
}
