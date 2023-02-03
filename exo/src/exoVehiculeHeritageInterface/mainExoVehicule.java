package exoVehiculeHeritageInterface;

public class mainExoVehicule {

	public static void main(String[] args) {
		
		Vehicule voiture1 = new Vehicule(4,"essence",180,50,15);
		Vehicule moto1 = new Vehicule(2,"diesel",220,25,10);
//		System.out.println(voiture1);
//		System.out.println(moto1);	
		
		PompeAessence pompe1 = new PompeAessence("diesel",1000,700);
		PompeAessence pompe2 = new PompeAessence("essence",1000,800);
		PompeAessence pompe3 = new PompeAessence("gpl",1000,250);	
		
//		voiture1.fairePlein(pompe1,voiture1);
//		voiture1.fairePlein(pompe2,voiture1);
//		voiture1.fairePlein(pompe3,voiture1);
//		voiture1.fairePlein(pompe1,moto1);
		
		System.out.println("------------------------");
		voiture1.fairePlein(pompe1);
		System.out.println("------------------------");
		voiture1.fairePlein(pompe2);
		System.out.println("------------------------");
		voiture1.fairePlein(pompe3);
		System.out.println("------------------------");
		System.out.println(moto1);
		moto1.fairePlein(pompe1);
		System.out.println(moto1);
		System.out.println("------------------------");
	}
}
