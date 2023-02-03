package S1exo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo2V2 {

public static void main(String []args) {
		
		Filiere mk = new Filiere(2,"Gestion de projet");
		Filiere av = new Filiere(1,"Assistance de vie");
		Filiere cda = new Filiere(3,"CDA");
		Filiere devops = new Filiere(9,"DevOps");
		
		Filiere devops2 = new Filiere(5,"eeeeeeeee");
		
		ArrayList<Filiere> filieres = new ArrayList<>();
		
		filieres.add(mk);
		filieres.add(av);
		filieres.add(cda);
		filieres.add(devops);
		
		//AFFICHAGE LISTE DE FILIERES
		System.out.println("\t Liste des fili�res\n"
				+ "+--------------------+");
		
		//FOREACH
		
		for (Filiere element : filieres) {
			System.out.println("|  " +element+ "  |");
		}
		
		
		
		
		System.out.println("+---------------------+");
		
		
		//CREATION ETUDIANTS
		
		ArrayList<Etudiant> etudiants = new ArrayList<>();
		
		System.out.println(etudiants);
		
		Scanner scanner = new Scanner(System.in);
		
		if (etudiants.size() < 1) {
			System.out.println("La liste des etudiants est vide \n "
					+ " Voulez-vous rajouter un etudiant OUI/NON?");
		} else {
			System.out.println( " Voulez-vous rajouter un etudiant OUI/NON?");

		}
		
		String reponse = scanner.next(); // OUI
		
		while(reponse.equalsIgnoreCase("Oui")) { //OUI -- OuI - ouI
			System.out.println("Entrez le nom,prénom et Filiére");
			String nom_saisi = scanner.next();
			String prenom_saisi = scanner.next();
			String filiere_saisi = scanner.next();
			
			// Verification si la fili�re saisi est dans la liste
			for (Filiere fil : filieres) {
				
				if (fil.getLibelle().equals(filiere_saisi)) {
					etudiants.add(new Etudiant(nom_saisi,prenom_saisi,fil));
					
				}
			}
			
			System.out.println("Voulez vous en rajouter ?");
			reponse = scanner.next();
		}
		
		// LISTE DES ETUDIANTS
		System.out.println("\t Liste des etudiants par Filiere");
		System.out.println("+ ----------------------------- +");
		int compteur = 1;
		for (Etudiant etudiant : etudiants) {
			System.out.println(compteur+ ". " +etudiant);
			compteur++;
		}
		System.out.println("+ ----------------------------- +");
		
		
		for (Filiere filiere : filieres) { // Gestion de projet 
			System.out.println("***************** \n \t"+filiere);
			boolean isEmpty = false;
			
			
			int compteur1 = 1;
			for (Etudiant etudiant : etudiants) {
				if ((etudiant.getFiliere().getLibelle().equalsIgnoreCase(filiere.getLibelle()))) {
					System.out.println("\t" +compteur1+ " " +etudiant.getPrenom() +"\n");	
						isEmpty = true;
						compteur1++;
				}
			}

			if(!isEmpty) {
				System.out.println(" \t Pas d'inscrit  ");	
			}
		}
		System.out.println("A trouver");
		String aTrouver = scanner.next();
		
		System.out.println(findByName(aTrouver,etudiants));
	}



	public static Etudiant findByName(String nom, ArrayList<Etudiant> listeEtudiant ) {
		boolean isNotExist = false;
		
		Etudiant resultat = null;
		
		for (Etudiant etudiant : listeEtudiant) {
			
			if (etudiant.getNom().equalsIgnoreCase(nom)) {
				resultat = new Etudiant(etudiant.getNom(), etudiant.getPrenom(), etudiant.getFiliere());
				
				isNotExist = true;
			}
		}
		
		if(!isNotExist) {
			System.out.println(" \t Pas trouvé  ");	
		}
		return resultat;
	}
}
