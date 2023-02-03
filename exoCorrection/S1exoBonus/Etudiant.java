package S1exoBonus;

import java.util.Scanner;

public class Etudiant {
	int numeroIns;
	String nom;
	String prenom;
	float moyenneGen;
	
	Formation form;

	public Etudiant(int numeroIns, String nom, String prenom, Formation form) {
		this.numeroIns = numeroIns;
		this.nom = nom;
		this.prenom = prenom;
		this.form = form;
	}

	public int getNumeroIns() {
		return numeroIns;
	}

	public void setNumeroIns(int numeroIns) {
		this.numeroIns = numeroIns;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public float getMoyenneGen() {
		return moyenneGen;
	}

	/*
	 * un modificateur setMoy() qui calcule la moyenne générale d'un étudiant en saisissant au clavier 
	 * ses notes dans les différentes matières de sa formation.
	 */
	public void setMoy() {
		//this.moyenneGen = moyenneGen;
		float total = 0;
		float totCoef = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Etudiant " + nom + " " + prenom);
		
		/*//entrySet(): Retourne l'ensemble de clés et valeurs
        for (Entry<String, Integer> matiere: form.getListeMatiere().entrySet()) {
        	System.out.println("Saisir la note en " + matiere.getKey() + ":");
        // getKey(): Retourne l'ensemble de clés,
            String la_cle = matiere.getKey();
            // getValue(): Retourne l'ensemble de clés,
            Integer la_valeur = matiere.getValue();
            
            System.out.println("Key: " + la_cle + " ==> value: " + la_valeur);
        }*/
		
		for (Object matiere : form.getListeMatiere().keySet()) {
			System.out.println("Saisir la note en " + matiere + ":");
			float note_saisi = sc.nextFloat();
			float coef = form.getListeMatiere().get(matiere);
			
			System.out.println("\t Son coefficient est" +coef);
			
			totCoef += coef;
			total += note_saisi * coef;
			
		}
		
		moyenneGen = total / totCoef;
	}

	public Formation getForm() {
		return form;
	}

	public void setForm(Formation form) {
		this.form = form;
	}

	@Override
	public String toString() {
		return "Etudiant [numeroIns=" + numeroIns + ", nom=" + nom + ", prenom=" + prenom + ", moyenneGen=" + moyenneGen
				+ ", form=" + form + "]";
	}
	
	

}
