/**
 * 
 */
package exoPersoArme;

import java.util.Scanner;

/**
 * @author bourg
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.err.println("---------------" + "Bienvenue dan WOW !" + "---------------");
//		System.out.println("Quel est ton nom :");
//		String choixNom = sc.next();
//		System.out.println("Quel est ton arme (EPEE,COUTEAU,MASSE,PISTOLET,ARC) :");
//		String choixArme = sc.next();
//		Arme arme1 = new Arme("excalibure",TypeArme.choixArme,40);
//		Joueur player1 = new Joueur(choixNom,choixArme);
//		System.err.println("Tu es : " + choixNom + " et t'es caracteristiques sont : " + player1 );
		
		
		
		
		
		
		
		
		Arme arme2 = new Arme("excalibure",TypeArme.EPEE,40);
		Arme arme3 = new Arme("glock",TypeArme.PISTOLET,80);
		Arme arme4 = new Arme("arbalette",TypeArme.ARC,30);
		Joueur player2 = new Joueur("zelda", arme2);
		Joueur player3 = new Joueur("callof", arme3);
		Joueur player4 = new Joueur("robin", arme4);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(player4);
		
		player2.desarmer();
		System.out.println(player2);
		
		
		
		player2.changeArmer(arme2);
		System.out.println(player2);
		
		player2.attaquer(player3);
		player3.attaquer(player4);
		player4.attaquer(player2);
	
	}

}
