package S1exo3;

import java.util.ArrayList;

public class Exo3 {

	public static void main(String []args) {
			
			Filiere mk = new Filiere(2,"Gestion de projet");
			Filiere av = new Filiere(1,"JAVA / JEE");
			Filiere cda = new Filiere(3,"CDA");
			Filiere devops = new Filiere(5,"DevOps");
			Filiere php = new Filiere(4,"PHP");
			
			ArrayList<Filiere> filieres = new ArrayList<>();
			filieres.add(mk);
			filieres.add(av);
			filieres.add(cda);
			filieres.add(devops);
			filieres.add(php);
			
			//AFFICHAGE LISTE DE FILIERES
			System.out.println("\t Liste des fili�res\n"
					+ "+--------------------+");
			for (Filiere filiere : filieres) {
				System.out.println("|  " +filiere+ "  |");
			}
			System.out.println("+---------------------+");
			
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
			
			
			Specialite j2ee = new Specialite("JAVA / JEE");
			Specialite gp = new Specialite("Gestion de projet");
			Specialite js = new Specialite("JS");
			Specialite ht = new Specialite("HTML / CSS");
			Specialite php1 = new Specialite("PHP");
			
			ArrayList<Enseignant> ens = new ArrayList<>();
			Enseignant etud = new Enseignant("Camara", "Moussa", j2ee);
			ens.add(etud); 
			ens.add(new Enseignant("TEST", "Mouski2", php1));
			
			ens.add(new Enseignant("TEST3", "Mouski3", gp));
			
			ens.add(new Enseignant("TEST4", "Mouski4", js));
			
			// AFFICHAGE
			for (Filiere filiere : filieres) {
				System.out.println("***************** \n \t"+filiere);
				boolean isEmpty = false;
				int compteur1 = 1;
				for (Enseignant enseignant: ens) {
					if(enseignant.getSpec().getNom() == filiere.getLibelle()) {
						System.out.println("Formateur : " + enseignant.getNom() +"  "+ enseignant.getPrenom());
					}
				}
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
