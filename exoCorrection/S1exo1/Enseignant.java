/**
 * 
 */
package S1exo1;

/**
 * @author Moussa CAMARA
 *
 */
public class Enseignant {
	
	private String nom;
	private String prenom;
	private Specialite spec;
	
	public Enseignant(String nom, String prenom, Specialite spec) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.spec = spec;
	}

	/**
	 * @param nom
	 * @param prenom
	 */
	public Enseignant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @param nom
	 */
	public Enseignant(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Specialite getSpec() {
		return spec;
	}

	@Override
	public String toString() {
		return "Enseignant [nom=" + nom + ", prenom=" + prenom + ", spec=" + spec + "]";
	}


	

}
