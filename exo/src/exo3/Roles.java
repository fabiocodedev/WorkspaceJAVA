package exo3;

public class Roles {

		public String poste ;
		
		// Constructeur par defaut !
		public Roles() {
		}
		public Roles(String roleAChanger) {
			this.poste = roleAChanger;
		}
		@Override
		public String toString() {
			return poste ;
		}

}
