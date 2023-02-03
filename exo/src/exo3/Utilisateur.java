package exo3;

public class Utilisateur {

		public String nom ;
		public String prenom ;
		public Roles poste ;
		
		
		// Constructeur par defaut !
		public Utilisateur(String nomAChanger, String prenomAChanger) {
			this.nom = nomAChanger;
			this.prenom = prenomAChanger;
		}
		public Utilisateur(String nomAChanger, String prenomAChanger, Roles poste) {
			this.nom = nomAChanger;
			this.prenom = prenomAChanger;
			this.poste = poste;
		}
		@Override
		public String toString() {
			return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", poste=" + poste + "]";
		}

	}


