import java.util.Scanner; 

public class PowerCalculator {

	public static void main(String[] args) {
		HelperMethods Helper = new HelperMethods(); 
		Scanner scan = new Scanner(System.in);
		char cont = 'y'; 
		String answer = ""; 
		while (cont == 'y') {
			System.out.println("Hello! Please enter a number: "); 
			String userInput = scan.next(); 
			int userNum = Integer.parseInt(Helper.validateEntryInt(userInput)); //makes sure valid input is entered, then converts to Int
			
			System.out.println("Number    Squared    Cubed"); 
			System.out.println("=======   =======    =====");
			for (int i = 1; i <= userNum; i++) {
				System.out.println(i + "         " + Helper.squared(i) + "          " + Helper.cubed(i)); 
			} // brute forced the formatting because I admittedly could not figure out how to line it all up neatly using printf. 
			System.out.println(""); 
			
			for (int i = 1; i <=  userNum; i++) {
				System.out.println(Helper.multiplicationTable(i)); 
			}
			
			System.out.println("Would you like to continue? (y/n)");  
			answer = scan.next(); 
			answer = Helper.validateEntryContinue(answer);  
			cont = Character.toLowerCase(answer.charAt(0));  // makes sure the user only enters Y or N, whether upper or lowercase
			
			if (cont == 'n') {
				System.out.println("Thank you for playing!"); 
			}
			
		
		}
		scan.close(); 

	}
}
