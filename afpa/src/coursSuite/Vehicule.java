package coursSuite;

public class Vehicule {
	// ATTRIBUT
	private String marque ;
	private String moteur ;
	private int nbRoues ;
	// CONSTRUCTEURS
	public Vehicule() {
	}
	public Vehicule(String marque, String moteur, int nbRoues) {
		super();
		this.marque = marque;
		this.moteur = moteur;
		this.nbRoues = nbRoues;
	}
	// GETTERS/SETTERS
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getMoteur() {
		return moteur;
	}
	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}
	public int getNbRoues() {
		return nbRoues;
	}
	public void setNbRoues(int nbRoues) {
		this.nbRoues = nbRoues;
	}
	// METHODE TOSTRING
	@Override
	public String toString() {
		return "Moto [marque=" + marque + ", moteur=" + moteur + ", nbRoues=" + nbRoues + "]";
	}
	
	
}
