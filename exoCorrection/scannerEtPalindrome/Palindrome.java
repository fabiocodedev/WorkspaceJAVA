package scannerEtPalindrome;

public class Palindrome {
	public static String inverse(String chaine) {
		String invertion = "";
		
		for (int i = 0; i < chaine.length(); i++) {
			invertion += chaine.charAt(chaine.length() - i - 1);
		}
		System.out.println(" Chaine inversee =>" +invertion);
		return invertion;
	}
}
