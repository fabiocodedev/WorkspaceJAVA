package cours;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World1 !");
		System.out.print("Hello World2 ! ");
		System.out.println("Hello World3 !");
//
		/*
		 * 
		 * 
		 */
		int number1 = 50 ;
		System.out.println("number1 est egale à : "+number1);
		
		
		
		Personne fab = new Personne() ;
		System.out.println(fab);
		
		Personne karim = new Personne("arfi","karim") ;
		System.out.println(karim);
		
		Personne bafo = new Personne("bafo") ;
		System.out.println(bafo);
		
		final int NBROUE = 4 ;
		System.out.println(NBROUE);
		
		System.out.println(Personne.email);
		
		//Les tableaux
		
		int [] tab1 = {1,2,3};
		String [] tab2 = {"oui","non","peut-être"};
		double [] tab3 = {1,2,3,4.5};
		System.out.println("Voici le contenu du tableaux : "+tab1[0]);
		System.out.println("Voici le contenu du tableaux : "+tab2[1]);
		System.out.println("Voici le contenu du tableaux : "+tab3[2]);
		System.err.println("Voici le contenu du tableaux : "+tab3[2]);
		
		for (int index : tab1) {
			System.out.println("index : " +index);
		}
		
		for (int i = 0;i < tab3.length;i++) {
			System.out.println(tab3[i]);
		}
		
		
		
		//Les collections
		
		ArrayList<String> collection = new ArrayList<> ();
 		collection.add("azerty") ;
 		collection.add("qwerty") ;
 		System.out.println("size = "+collection.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
