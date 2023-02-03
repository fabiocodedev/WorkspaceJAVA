package exo2;

public class Premier {

	public static void main(String[] args) {
	
		
		int nb = 69;
		
		
        
     for (int i = 2; i < nb; i++) {
		
		if (nb % i == 0) { 
			System.out.println(nb+" n'est pas premier");
			break;
			}
		else {
			System.out.println(nb+" est premier");
		    };
     }
     
     
     

	}

}
