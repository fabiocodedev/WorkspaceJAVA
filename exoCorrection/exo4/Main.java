package exo4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 5.Écrire un programme de test de la classe livre qui
		 *  demande à l’utilisateur le nombre de livre à créer. 
		 *  Pour chaque livre, le programme demande le titre, 
		 *  l’auteur et le prix.
		 */
		System.out.print("Combien de livres : ");
        Scanner sc = new Scanner(System.in);
        int nbreLivre = sc.nextInt();
        
        /*
         * Autre version avec tableau classique
         */
        
        /* ICI je crée un tableau de type Livre de taille nbreLire
         * saisi par l'utilisateur
         */
        Livre livres[] = new Livre[nbreLivre];
        
        for (int i = 0; i < livres.length; i++) {
			System.out.println("Saisir le titre du livre " +(i+1));
			String titre = sc.next();
			System.out.println("Saisir l'auteur du livre "+(i+1));
			String auteur = sc.next();
			System.out.println("Saisir le pirx du livre "+(i+1));
			float prix = (float) sc.nextDouble();
			
			// CREATTION DE CHAQUE LIVRE
			livres[i] = new Livre(titre,auteur,prix);
			
		}
        
       
        	float totalP = 0;
        
        for (Livre livre : livres) {
        	/*
        	 * 6.	Afficher la liste des livres
        	 */
			System.out.println(livre);
			
			totalP += livre.getPrix();
		}
        
        /*
         * 
			7.	Le programme doit aussi afficher le nombre de livre
			 ainsi que le prix total des livres

         */
       // System.err.println("Le cout total des "+ nbreLivre+ " livres: "+totalP);
        
        
        System.err.printf("Le cout total des %d livres est: %.2f ", nbreLivre,totalP);
	}

}













