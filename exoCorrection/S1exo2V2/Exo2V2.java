package S1exo2V2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo2V2 {

public static void main(String []args) {
		
		Filiere mk = new Filiere(2,"Gestion de projet");
		Filiere av = new Filiere(1,"Assistance de vie");
		Filiere cda = new Filiere(3,"CDA");
		Filiere devops = new Filiere(3,"DevOps");
		
		ArrayList<Filiere> filieres = new ArrayList<>();
		filieres.add(mk);
		filieres.add(av);
		filieres.add(cda);
		filieres.add(devops);
		
		//AFFICHAGE LISTE DE FILIERES
		System.out.println("\t Liste des fili�res\n"
				+ "+--------------------+");
		for (Filiere filiere : filieres) {
			System.out.println("|  " +filiere+ "  |");
		}
		System.out.println("+---------------------+");
		
		
		//CREATION ETUDIANTS
		
		ArrayList<Etudiant> etudiants = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		if (etudiants.size() < 1) {
			System.out.println("La lsite des etudiants est vide \n "
					+ " Voulez-vous rajouter un etudiant OUI/NON?");
		} else {

		}
		
		String reponse = scanner.next();
		
		System.out.println(filieres);
		while(reponse.equalsIgnoreCase("Oui")) {
			System.out.println("Entrez le nom,pr�nom et Fili�re");
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
		
		
		for (Filiere filiere : filieres) {
			System.out.println("***************** \n \t"+filiere);
			boolean isEmpty = false;
			
			
			int compteur1 = 1;
			for (Etudiant etudiant : etudiants) {
				if ((etudiant.getFiliere() != null)&& (etudiant.getFiliere().getLibelle().equalsIgnoreCase(filiere.getLibelle()))) {
					System.out.println("\t" +compteur1+ " " +etudiant.getPrenom() +"\n");	
						isEmpty = true;
						compteur1++;
				}
			}

			if(!isEmpty) {
				System.out.println(" \t Pas d'inscrit  ");	
			}
		}
	}
}
