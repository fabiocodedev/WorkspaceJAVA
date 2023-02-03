package S1exo2V1;


import java.util.ArrayList;


public class Exo2 {

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

		/*filieres.add(new Filiere(1,"CDA"));
		filieres.add(mk);
		filieres.add(new Filiere(2, "Assistance de vie"));*/
		
		//AFFICHAGE LISTE DE FILIERES
		System.out.println("\t Liste des fili�res\n"
				+ "+--------------------+");
		for (Filiere filiere : filieres) {
			System.out.println("|  " +filiere+ "  |");
		}
		System.out.println("+---------------------+");
		
		//CREATION ETUDIANTS
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez nom, pr�nom et Filliere");
		
		String nom = scanner.next();
		String prenom = scanner.next();
		String nomFil = scanner.next();*/
		// LISTE DES ETUDIANTS
		
		Etudiant etu1 = new Etudiant("Simpson","Homer",mk);
		Etudiant etu2 = new Etudiant("Simpson","Bart",av);
		Etudiant etu3 = new Etudiant("Simpson","Lisa",cda);
		Etudiant etu4 = new Etudiant("Simpson","Marge",cda);
		ArrayList<Etudiant> etudiants = new ArrayList<>();
		
		etudiants.add(etu1);
		etudiants.add(etu2);
		etudiants.add(etu3);
		etudiants.add(etu4);
		
		//AFFICHAGE LISTE DES ETUDIANTS
		System.out.println("\t Liste des etudiants\n"
				+ "+--------------------------------+");
		
		for (Etudiant etudiant : etudiants) {
			System.out.println("|  " +etudiant+ "  |");
		}
		System.out.println("+--------------------------------+");
		
		for (Filiere filiere : filieres) {
			System.out.println("------------------------------------ \n \t"+filiere+ "\n-------------------------------------");
			boolean isEmpty = false;
			
			
			int compteur = 1;
			for (Etudiant etudiant : etudiants) {
				if ((etudiant.getFiliere() != null)&& (etudiant.getFiliere().getLibelle().equalsIgnoreCase(filiere.getLibelle()))) {
					System.out.println("\t" +compteur+ " " +etudiant.getPrenom() +"\n");	
						isEmpty = true;
						compteur++;
				}
			}

			if(!isEmpty) {
				System.out.println(" \t Pas d'inscrit  ");	
			}
		}
	}
}
