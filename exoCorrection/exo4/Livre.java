package exo4;


/*
 * Correction EXO LIVRE
 * 1.Définir une classe Livre avec les attributs suivants :  Titre, Auteur, Prix.
 */

public class Livre {
	private String titre;
    private String auteur;
    private float prix;
    
    /*
     * 3. Définir un constructeur permettant d’initialiser
     *  les attributs d'un objet livre par des valeurs saisies par l’utilisateur. 
     */
	public Livre(String titre, String auteur, float prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	/*
	 * 2.Définir les accesseurs aux différents attributs de la classe.
	 */
	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public float getPrix() {
		return prix;
	}
	
	/*
	 * 4.	Définir la méthode toString () permettant d’afficher les informations du livre.
	 */
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + "]";
	}
}
