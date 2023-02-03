package exo1et2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello");
		// System.out.print("Hello");
		
		/*
		 * LES TYPES PRIMITIFS
		 */
		//entre - 2 147483648 (-2^31) et +2 147 483647 (-2^31-1)
		//int nombre1 = 50;

		//double nombre2 = 99.9;

		//entre -9,223,372,036,854,775,808(-2^63) et +9,223,372,036,854,775,87(-2^63-1)
		//long nombre3 = 29999;

		// type caractère : char ;
		//String caractere = "Ceci est un test";

		//type booléen : boolean ;
		//boolean condition = true;

		//CONSTANTE - VARIABLE
		//final int nb = 4;
		
		// TYPE DE REFERENCE
		Personne p1 = new Personne();
		
		System.out.println(p1);
		
		Personne p2 = new Personne("Arfi","Karim");
		
		System.out.println(p2.nom);
		
		System.out.println(p2);
		
		Personne p3 = new Personne("Moussa");
		
		System.out.println(p3);
		
		//System.out.println(Personne.nom);
		
		System.out.println(Personne.email);
		
		// LES TABLEAUX
		int [] tab = {1,20,3,14,5,9};
		
		//double tab2[] = {1,2,3,4,5,9.5};
		
		System.out.println("Le premier element:" +tab[0]);
		
		System.err.println("Le premier element:" +tab);

		//Tous les elements de mon tableau
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}

		
		for(int elt : tab) {
			System.out.println(" index : "+ elt );
		}
		
		// LES COLLECTIONS
		
		// Création de notre collection et ajouts de données        
        ArrayList<String> coll = new ArrayList<>();

        coll.add( "azerty" );
        coll.add( "qwerty" );

        // Combien y a t'il de données dans la collection ?
        System.out.println( "Size == " + coll.size() );
        System.out.println("Pour obtenir (sans le retirer) un élément situé à "
        		+ "une position donnée.");
        System.out.println(coll.get(0));
        
        System.out.println("Pour vérifier si un élément est contenu dans la liste.");
        if(coll.contains("test"))
            System.out.println("Objet trouvé!");

        // Affichage des données de la collection
        for (String index : coll) {
            System.out.println( index );
        }
        
        jaimeLeJava();
       

	}
	
	public static void jaimeLeJava() {
		System.err.println("Je suis en dehors du main");
	
	}
	


}


















