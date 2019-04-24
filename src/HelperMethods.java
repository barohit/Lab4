import java.util.Scanner; 
public class HelperMethods {

	public int squared(int s) {
		return s * s; 
	}
	
	public int cubed(int s) {
		return s * s * s; // avoided a call to squared and used brute force instead because apparently the former will slow down the program
	}
	// for some reason I have to leave the Scanners here open, or it will throw a no such element exception in the power calculator.
	public String validateEntryInt(String userInput) { // I understand that the build specifications said to assume that the user will enter valid data, but I wanted the challenge. 
		Scanner scnr = new Scanner(System.in);
		boolean validEntry = false; 
		while (validEntry == false)  {
			validEntry =  true; 
			for (int i = 0; i < userInput.length(); i++) {
				if (Character.isDigit(userInput.charAt(i)) == false) {
					validEntry = false; 
				}
			}
			
			if (validEntry == false) {
				System.out.println("Error, invalid entry. Please try again: "); 
				userInput = scnr.next(); 
			}
		}
		 
		return userInput; 
	}
	
	public String validateEntryContinue(String userInput) {
		Scanner scnr = new Scanner(System.in); // scanners are not closed for same reason
		boolean validEntry = false; 
		while (validEntry == false)  {
			validEntry =  true; 
				if (Character.toLowerCase(userInput.charAt(0)) != 'y' && Character.toLowerCase(userInput.charAt(0)) != 'n') {
					validEntry = false; 
				}
			}
			
			if (validEntry == false) {
				System.out.println("Error, invalid entry. Please try again: "); 
				userInput = scnr.next(); 
			}
		return userInput; 
	}
	
	public String multiplicationTable(int i) {
		String result = ""; 
		for (int j = 1; j <= 10; j++) {
			result += i + " * " + j + " = " + (i*j) + "\n";
		}
		return result; 
	}
}
