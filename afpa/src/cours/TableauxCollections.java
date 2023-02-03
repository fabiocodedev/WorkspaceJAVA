package cours;

import java.util.ArrayList;
import java.util.Arrays;

public class TableauxCollections {
	public static void main(String[] args) {
	
	System.err.println("LES COLLECTIONS");
		
	// COLLECTION + AJOUT
	ArrayList<String> semaineColl = new ArrayList<>();
			semaineColl.add("lundi");
			semaineColl.add("mar");
			semaineColl.add("mercredi");
			semaineColl.add("jeudi");
			semaineColl.add("vendredi");
			semaineColl.add("samedi");
			semaineColl.add("dimanc");
		System.out.println(semaineColl);
			
			// AUTRE VERSION COLLECTION + AJOUT
	ArrayList<String> semaineColl1 = new ArrayList<>(Arrays.asList("lundi","mar"));		
		System.out.println(semaineColl1);
			
		// SUPPRIMER DIMANC
		System.out.println(semaineColl.remove(semaineColl.size()-1));
		System.out.println(semaineColl);
		// AJOUTER DIMACHE
		semaineColl.add("dimanche");
		System.out.println(semaineColl);
		// AFFICHER JUSTE MAR VIA SON INDEX
		System.out.println(semaineColl.indexOf("marz")); // NO MATCH
		System.out.println(semaineColl.indexOf("mar")); // MATCH
		System.err.println(semaineColl.get(1));
		
		// REMPLACER MAR PAR MARDI 
		System.out.println(semaineColl.set(1, "mardi"));
		System.out.println(semaineColl);
		
		System.err.println(semaineColl.get(1));
		
	}
}
