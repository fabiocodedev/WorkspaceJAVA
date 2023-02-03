package exo1et2;

import java.util.ArrayList;
import java.util.Arrays;


public class Cda {

	public static void main(String[] args) {
		/*
		 * Reprendre notre serie d’exos JavaScript
			Exercice  : Soit le tableau suivant : 
			Semaine = [‘lundi’, ‘mar’, ‘mercredi’, ‘jeudi’, ‘vendredi’, ‘samedi’, ‘dimanc’] ;
			1.	Retirer la dernière valeur du tableau
			2.	Afficher les valeurs du tableau
			3.	Ajouter la valeur la valeur ‘dimanche’ à la fin du tableau
			4.	Remplacer le mar par mardi
			5.	Afficher le nombre de valeurs du tableau
			6.	Afficher la 5éme valeur
		 */
		
		
		 String semaine[] = {"lundi","mar","mercredi","jeudi","vendredi","samedi","dimanc"};
		System.out.println("1.	Retirer la dernière valeur du tableau");
		
		String semaine2[] = new String[semaine.length];
		
		for (String element : semaine2) {
			System.out.println(element);
		}
		
		for (int i = 0; i < semaine2.length; i++) {
			semaine2[i] = semaine[i];
			
			if (semaine2[i] == "mar") {
				System.out.println("**************"+semaine2[i]);
			}
			
			System.out.println(semaine2[i]);
		}
	
		System.err.println("LES COLLECTIONS ");
		/*ArrayList<String> semaineColl = new ArrayList<>();
		semaineColl.add("lundi");
		semaineColl.add("mar");
		semaineColl.add("mercredi");
		semaineColl.add("jeudi");
		semaineColl.add("vendredi");
		semaineColl.add("samedi");
		semaineColl.add("dimanc");
		*/
		
		ArrayList<String> semaineColl = new ArrayList<>(Arrays.asList("lundi","mar","mercredi",
				"jeudi","vendredi","samedi","dimanc"));
		semaineColl.remove(semaineColl.size()-1);
		//System.out.println(semaineColl.remove(semaineColl.size()-1));
		
		System.out.println(semaineColl);
		semaineColl.add("dimanche");
		System.out.println(semaineColl.indexOf("mar"));
		
		int position = semaineColl.indexOf("mar");
		
		semaineColl.set(position, "mard");
		
		System.out.println(semaineColl.get(semaineColl.indexOf("samedi")));
		
	}
}