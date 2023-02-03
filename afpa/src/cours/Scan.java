package cours;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		System.out.println("entrez quelque chose : ");
		// BUG DE SCANNER SOULIGNE EN JAUNE
		Scanner scanner = new Scanner(System.in);
		String choix = scanner.next();
		System.err.println("Voici ton choix "+choix);
	}

}
