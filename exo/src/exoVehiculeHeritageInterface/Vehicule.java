package exoVehiculeHeritageInterface;

public  class Vehicule implements ImethodeVehicule{
	// ATTRIBUT
		protected int nbRoue ;
		protected String typeCarb ;
		protected int vitMax ;
		protected int contenanceV ;
		protected int contenuV ;
		// contenance = volume total du reservoir
		// contenu = volume contenu actuellement dans le reservoir
		//CONSTRUCTEUR
		public Vehicule(int nbRoue, String typeCarb, int vitMax, int contenanceV, int contenuV) {
			super();
			this.nbRoue = nbRoue;
			this.typeCarb = typeCarb;
			this.vitMax = vitMax;
			this.contenanceV = contenanceV;
			this.contenuV = contenuV;
		}
		@Override
		public String toString() {
			return "Vehicule [nbRoue=" + nbRoue + ", typeCarb=" + typeCarb + ", vitMax=" + vitMax + ", contenanceV="
					+ contenanceV + ", contenuV=" + contenuV + "]";
		}
		//GETTERS
		public int getNbRoue() {
			return nbRoue;
		}
		public String getTypeCarb() {
			return typeCarb;
		}
		public int getVitMax() {
			return vitMax;
		}
		public int getContenanceV() {
			return contenanceV;
		}
		public int getContenuV() {
			return contenuV;
		}
		// METHODE STADART
		public void fairePlein(PompeAessence pompe) {
			
			if (this.typeCarb.equalsIgnoreCase(pompe.getCarbType())) {
				System.out.println("Authoriser a faire le plein !");
				
				int besoinCarbVhl = this.contenanceV - this.contenuV;
				System.out.println("Besoin en carburant : " + besoinCarbVhl + ", contenu de la pompe : " + pompe.getContenuP() );
				
				if (pompe.getContenuP() < besoinCarbVhl) {
					System.out.println("Pas assez de carburant dans la pompe !");
					}
				else {pompe.setContenuP(pompe.getContenuP() - besoinCarbVhl);
					this.contenuV += besoinCarbVhl;
					System.out.println("Le contenu de la pompe est maintenant de " + pompe.getContenuP());
					}
				System.out.println("Le plein a ete fait !");
				}
			else {System.err.println("Mauvaise pompe, carburant incompatible !");}	
					}		
		// METHODE EN STATIC
//		public static void fairePlein(PompeAessence pompe,Vehicule vhl ) {
//			if (pompe.carbType.equalsIgnoreCase(vhl.typeCarb)) {
//				System.out.println("Le plein a ete fait !");
//			}
//				else {
//					System.out.println("Mauvaise pompe, le plein n'a pas ete fait !");
//				}
		//METHODE VIA INTERFACE
//		@Override
//		public void fairePlein(PompeAessence pompe, Vehicule vhl) {
//			if (pompe.carbType.equalsIgnoreCase(vhl.typeCarb)) {
//				System.out.println("Le plein a ete fait !");
//			}
//				else {
//					System.out.println("Mauvaise pompe, le plein n'a pas ete fait !");
//		}
	}


