package exo1et2;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {
	public static void main(String[] args) {
		
		HashMap<String, Integer> monDico = new HashMap<String, Integer>(); 
		System.out.println("-----------------"); 
		monDico.put("Toto", 34); 
		monDico.put("Titi", 28); 
		monDico.put("Tutu", 31); 
		monDico.put("Tutu", 34); 

		// foreach - fonction fléchée - sans appel de fonction 
		monDico.forEach( (key,value) -> { 
			System.out.println("-----------------"); 
			System.out.println("nom : " + key + " age : " + value); 
		}); 

		// foreach - fonction fléchée - sans appel de fonction - version compacte 
		System.out.println("-----------------"); 
		monDico.forEach((key,value) -> System.out.println("nom : " + key + " age : " + value)); 

		// foreach - fonction fléchée - avec appel de fonction System.out.println("-----------------"); 
		monDico.forEach( (nom,age) -> printMap(nom, age)); 

		
		
		
		Set<String> ingredients = new HashSet<String>();
		ingredients.add("eggs");
		ingredients.add("sugar");
		ingredients.add("butter");
		ingredients.add("salt");
		ingredients.add("sugar");
		ingredients.remove("butter");
		for(String element: ingredients){
		System.out.println(element);
		}
		System.out.println(ingredients.toString());
		System.out.println("******************* \t HASHSET \n" +ingredients.size());
		System.out.println("**FIN HASHSET****************" );
	
		/* équivalent HASHMAP 
			Map<String, String> personne = new HashMap<>();
		*/
		HashMap<String, String> personne = new HashMap<>();
		//Ajout 
		personne.put("007", "James");
		personne.put("008", "CDA");
		personne.put("009", "Moussa");

		Set<String> cles = personne.keySet();
		Collection<String> valeurs =  personne.values();
		
        System.out.println(cles+"====="+valeurs);
        
		System.out.println("===================="+personne.remove("009"));
		System.out.println("===================="+personne);
        
        //entrySet(): Retourne l'ensemble de clés et valeurs
        for (Entry<String, String> contact: personne.entrySet()) {
        // getKey(): Retourne l'ensemble de clés,
            String la_cle = contact.getKey();
            // getValue(): Retourne l'ensemble de valeurs,
            String la_valeur = contact.getValue();
            
            System.out.println("Key: " + la_cle + " ==> value: " + la_valeur);
        }
        
	}

	 static void printMap(String nom, int age){ 
		System.out.println("nom : " + nom + " age : " + age); 
	}

}
