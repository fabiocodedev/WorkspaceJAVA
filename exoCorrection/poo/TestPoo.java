package poo;

public class TestPoo {

	public static void main(String[] args) {

		//INSTANCIATION
		Produit produit = new Produit();
		//ACCESSEURS -- AFFICHAGE
		System.out.println(produit.getTitre());
		
		// MUTATEURS -- MODIFICATION
		
		produit.setTitre("TOTO");
		//ACCESSEURS -- AFFICHAGE
		System.out.println(produit.getTitre());
		
		// 
		
	}

}
