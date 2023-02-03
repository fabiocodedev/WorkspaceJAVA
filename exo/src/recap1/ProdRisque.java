/**
 * 
 */
package recap1;

/**
 * @author bourg
 *
 */
public class ProdRisque extends Production implements Iprime {
	//ATTRIBUT
	private boolean danger;
	//CONSTRUCTEUR
	public ProdRisque(String nom, String prenom, int age, String date, int nbProduit, boolean danger) {
		super(nom, prenom, age, date, nbProduit);
		this.nbProduit = nbProduit;
		this.danger = danger;
	}
	//METHODE
	
	@Override
	public int prime() {
		return 200;
	}
	public double calculeSalaire() {
		return super.calculeSalaire() + prime();
	}

	
//	@Override
//	public int prime() {
//		double salaireV =  (nbProduit * 5) ;
//		salaireV =+ 200;
//		return (int) salaireV;
//	}
//	
//	
//	void newCalcSalaire() {
//		if(danger == true){
//			this.prime();
//			}
//		else {
//			this.calculeSalaire();
//			}
//		}

	//TOSTRING
	@Override
	public String toString() {
		return getNom() + " touche un salaire de : " + this.calculeSalaire() ;
	}
	
	
}
