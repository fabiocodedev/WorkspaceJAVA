/**
 * 
 */
package recap1;

/**
 * @author bourg
 *
 */
public class Production extends Employe {
	//ATTRIBUTS
	protected String type = "Production";
	protected int nbProduit;
	private boolean danger = false;
		//CONSTRUCTEUR
	public Production(String nom, String prenom, int age, String date, int nbProduit) {
		super(nom, prenom, age, date);
		this.nbProduit = nbProduit;
	}
	public void setNbProduit(int nbProduit) {
		this.nbProduit = nbProduit;
	}
	
	
	
		@Override
		double calculeSalaire() {
			double salaireV =  (nbProduit * 5) ;
			return salaireV ;
		}
		
//		@Override
//		double calculeSalaire() {
//			if(danger) {
//			double salaireV =  (nbProduit * 5) ;
//			return salaireV ;
//			}
//			else {}
//		}
		
		
		
		
		
		
		
		
		//TOSTRING
		@Override
		public String toString() {
			return getNom() + " touche un salaire de : " + this.calculeSalaire() ;
		}
			
}
