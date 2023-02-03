package S1exoBonus;

import java.util.HashMap;

public class Formation {
	private String id;

	
	private HashMap<String, Integer> listeMatiere = new HashMap<>();

	
	/**
	 * @param id
	 */
	public Formation(String id) {
		this.id = id;
	}

	public Formation(String id, HashMap<String, Integer> listeMatiere) {
		
		this.id = id;
		this.listeMatiere = listeMatiere;
	}

	public String getId() {
		return id;
	}
	
	

	public void setListeMatiere(HashMap<String, Integer> listeMatiere) {
		this.listeMatiere = listeMatiere;
	}

	public HashMap<String, Integer> getListeMatiere() {
		return listeMatiere;
	}

	public void decrireForm() {
		System.out.println("Formation " + id + "\n Matière");
		for (Object key : listeMatiere.keySet()) {
			System.out.println(key + " => " + listeMatiere.get(key));
		}
	}
	/*
	 * On veut pouvoir ajouter et supprimer une matière dans une formation, ainsi que le coefficient.
	 */
	
	public void ajouterMat(String nom, int coef) {
		listeMatiere.put(nom, coef);
	}
	
	public void supprimerMat(String nom) {
		listeMatiere.remove(nom);
	}

}
