package exo1et2;

public class NombrePremier {
	
	public static void main(String[] args) {
		
		int nombre = 42;
		boolean estPremier = true;
		
		for (int i = 2; i < nombre; i++) {
			if (nombre % i == 0) {
				System.out.println(nombre +" pas premier");
				estPremier= false;
				break;
			}
		}
		
		if(estPremier) {
			System.out.println(nombre +" premier");
		}
	}

}
