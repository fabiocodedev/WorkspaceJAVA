package cours;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		
		HashMap<String,String> personne = new HashMap<>();
				
				personne.put("007","James");
				personne.put("008","CDA");
				personne.put("009","Moussa");
				
				System.out.println(personne);
				
				// AFFICHER LES CLES
				Set<String> cles = personne.keySet();
				System.out.println(cles);
				
				// AFFICHER LES VALEURS
				Collection<String> valeurs1 = personne.values();
				System.err.println(valeurs1);
				
				// SUPP
				System.out.println(personne.remove("009"));
				System.out.println(personne);
				
				// "entrySet" RETOURNER L'ENSEMBLE DES CLES ET VALEURS 
				for (Entry<String,String> contact : personne.entrySet()) {
					// "getKey" RETOURNE L'ENSEMBLE DES KEYS
					String la_cle = contact.getKey();
					// "getKey" RETOURNE L'ENSEMBLE DES VALUES
					String la_valeur = contact.getValue();
					System.out.println("key = "+la_cle+" "+"value = "+la_valeur);
				}
				
			
				

	}
	
	
	// FONCTIONS
	
	public int test() {
		
		
		return 15;
		
	};

}
