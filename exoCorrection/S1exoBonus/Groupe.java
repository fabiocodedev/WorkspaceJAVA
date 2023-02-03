package S1exoBonus;

import java.util.HashSet;

public class Groupe {
	private String id;
	private Formation gFormation;
	private HashSet<Etudiant> listeEtudiants = new HashSet<>();
	
	
	/**
	 * @param id
	 * @param gFormation
	 * @param listeEtudiants
	 */
	public Groupe(String id, Formation gFormation) {
		this.id = id;
		this.gFormation = gFormation;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the gFormation
	 */
	public Formation getgFormation() {
		return gFormation;
	}

	/**
	 * @param gFormation the gFormation to set
	 */
	public void setgFormation(Formation gFormation) {
		this.gFormation = gFormation;
	}

	/**
	 * @return the listeEtudiants
	 */
	public HashSet<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}

	/**
	 * @param listeEtudiants the listeEtudiants to set
	 */
	public void setListeEtudiants(HashSet<Etudiant> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}

	/*
	 * l'on doit pouvoir ajouter et supprimer un étudiant au groupe, 
	 * aussi calculer la moyenne générale du groupe.
	 */
	public void ajouterEtudiant(Etudiant etudiant) {
		listeEtudiants.add(etudiant);
	}
	public void supprimerEtudiant(Etudiant etudiant) {
		listeEtudiants.remove(etudiant);
	}
	
	public float moyGroup() {
		float moyenneGroupe = 0;
		for(Etudiant etudiant: listeEtudiants) {
			moyenneGroupe+=etudiant.getMoyenneGen();
		}
		return moyenneGroupe/listeEtudiants.size();
	}
	
	/*
	 * Ajouter une méthode afficherGroupe() permettant d'afficher l'identifiant d'un groupe, 
	 * sa formation ainsi que la liste des étudiants.
	 */
	public void afficheGroupe() {
		System.out.println("-----------------------------------");
		System.out.println("\t Groupe: " + this.id);
		for(Etudiant etudiant: listeEtudiants) {
			System.out.println(etudiant);
		}
		
	}
	
}
