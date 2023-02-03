package S1exo3;

/**
 * @author Moussa Camara
 * Correction de l'exercice 1 de la serie JAVA
 */
public class Specialite {
	
	private String nom;

	/**
	 * @param nom
	 */
	public Specialite(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}


	@Override
	public String toString() {
		return  nom ;
	}
}
