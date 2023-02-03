/**
 * 
 */
package recap1;

/**
 * @author bourg
 *
 */
public class MainRecap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Employe emp1 = new Vente("Camara","Moussa",33,"15/10/2020");
		Employe emp2 = new Representation("Simpson","Bart",30,"17/06/2018");
		Employe emp3 = new Production("Cazo","Fab",23,"06/11/2021", 1638);
		//Employe emp4 = new Manutention("Tits","Sandra",41,"16/01/2015", 135);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		//System.out.println(emp4);
		
//		System.err.println(emp1.calculeSalaire());
//		System.err.println(emp2.calculeSalaire());
//		System.err.println(emp3.calculeSalaire());
//		System.err.println(emp4.calculeSalaire());
		

	}

}
