package exoVehiculeHeritageInterface;

public class PompeAessence {
	        // ATTRIBUT
			protected String carbType ;
			protected int contenanceP ;
			protected int contenuP ;
			// contenance = volume total du reservoir
			// contenu = volume contenu actuellement dans le reservoir
			// CONSTRUCTEUR
			public PompeAessence(String carbType, int contenance, int contenu) {
				super();
				this.carbType = carbType;
				this.contenanceP = contenance;
				this.contenuP = contenu;
			}
			//GETTEURS
			public String getCarbType() {
				return carbType;
			}
			public int getContenanceP() {
				return contenanceP;
			}
			public int getContenuP() {
				return contenuP;
			}
			//SETTEURS
			public void setCarbType(String carbType) {
				this.carbType = carbType;
			}
			public void setContenanceP(int contenanceP) {
				this.contenanceP = contenanceP;
			}
			public void setContenuP(int contenuP) {
				this.contenuP = contenuP;
			}
			
}
