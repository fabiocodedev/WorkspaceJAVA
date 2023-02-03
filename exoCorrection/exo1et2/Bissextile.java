package exo1et2;

public class Bissextile {

	public static void main(String[] args) {
		int year = 2006;
		
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			
			System.out.println(year+ " Bissextile");
		}else {
			System.out.println(year+ " n'est pas Bissextile");
		}
		

	}
	/*
	public static boolean isBissextile(int year) {
        boolean result = false;
        if ((year % 4 == 0) || (year % 100 != 0) && (year % 400 == 0)) {
            result = true;
        }
        return result;
    }*/
}
