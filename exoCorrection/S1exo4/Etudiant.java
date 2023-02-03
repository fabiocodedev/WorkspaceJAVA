/**
 * 
 */
package S1exo4;

/**
 * @author Moussa CAMARA
 *
 */
public class Etudiant {
	private String nom;
	private String prenom;
	private Filiere filiere;
	/**
	 * @param nom
	 * @param prenom
	 * @param filiere
	 */
	public Etudiant(String nom, String prenom, Filiere filiere) {
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
	}
	
	/**
	 * @param nom
	 * @param prenom
	 */
	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	@Override
	public String toString() {
		return  nom + "  " + prenom + "  " + filiere;
	}
	
	
}
