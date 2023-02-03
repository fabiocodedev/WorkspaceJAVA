package exo1;

public class BissextileMarc {

	public static boolean isBissextile(int year) {
        boolean result = false;
        if ((year % 4 == 0) || (year % 100 == 0) && (year % 400 == 0)) {
            result = true;
        }
        return result;
    }
	
}
