package coursSuite;

public class Exceptions {

	public static void main(String[] args) {


		int tab[] = {1,2,3,4,5};
		//1er TRY AND CATCH
		try {
			System.out.println(tab[5]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//2eme TRY AND CATCH
		// si l'essaie dans le TRY n'est pas concluant, il affiche l'exeption personaliser du CATCH !
		try {
			System.out.println("TRY" + " " + division(0));
		} catch (Exception exep) {
			System.err.println("CATCH" + " " + exep.getMessage());
			// le FINALLY est effectuer quel que soit le match avec le TRY ou le CATCH !
		} finally {
			System.out.println("FINALLY" + " " + "La methode `division` a ete utiliser !");
		}
}
	//METHODE
	public static double division (double div) throws Exception {
		if(div == 0) {
		throw new Exception("Diviser par 0 est impossible");
	}	
	return 1/div;
	}
}