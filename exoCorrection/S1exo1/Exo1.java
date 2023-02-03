package S1exo1;

import java.util.ArrayList;

public class Exo1 {

	public static void main(String[] args) {
	
		
		Specialite j2ee = new Specialite("JAVA / JEE");
		Specialite gp = new Specialite("Gestion de projet");
		Specialite js = new Specialite("JS");
		Specialite ht = new Specialite("HTML / CSS");
		Specialite php = new Specialite("PHP");
		
		
		ArrayList<Specialite> specialites = new ArrayList<>();
		specialites.add(j2ee);
		specialites.add(ht);
		specialites.add(gp);
		specialites.add(js);
		specialites.add(php);
		
		ArrayList<Enseignant> ens = new ArrayList<>();
		Enseignant etud = new Enseignant("Camara", "Moussa", j2ee);
		ens.add(etud); 
		ens.add(new Enseignant("TEST", "Mouski2", j2ee));
		
		ens.add(new Enseignant("TEST3", "Mouski3", php));
		
		ens.add(new Enseignant("TEST4", "Mouski4", js));
		
		
		for (Specialite specialite : specialites) {
			System.out.println("------------------------------------ \n"+specialites+ "\n-------------------------------------");
			boolean isEmpty = false;
			
			for (Enseignant enseignant : ens) {
				if (enseignant.getSpec().getNom().equalsIgnoreCase(specialite.getNom())) {
					System.out.println("\t" +enseignant +"\n");	
						isEmpty = true;
				}
			}
			
			if(!isEmpty) {
				System.out.println(" \t Aucun enseignant pour la sp�cialit�  " + specialite.getNom());	
			}
		}
	}
}
