package exo1;

public class Bissextile {

	public static void main(String[] args) {
		
		int annee = 2006;
		
		
		
		if ((annee%4 == 0 && annee%100 != 0) || annee%400 == 0){ 
			System.out.println(annee+" est bissextile");
			}
		else {
			System.out.println(annee+" n'est pas bissextile");
		    }
		
		

	}
	
	

}
