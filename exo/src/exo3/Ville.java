package exo3;

public class Ville {

		
		public String nom = "Paris" ;
		public int departement = 75000 ;
		
		
		// Constructeur par defaut !
		
				public Ville() {
				}
				
				public Ville(String nomAChanger, int departementAChanger) {
					this.nom = nomAChanger;
					this.departement = departementAChanger;
				}
				
				public Ville(String nomAChanger) {
					this.nom = nomAChanger;
				}
				// FONCTION POUR CHANGER NOM PAR DEF
				public String ChangeNomVille(String nomAChanger) {
					return this.nom = nomAChanger;
				}
				

				@Override
				public String toString() {
					return "ville = "+nom+" departement = "+departement;
				}

}
