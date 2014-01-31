
package mainMenu;
import java.util.Scanner;


public class Main_menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput = 0;
		boolean exitFcn = false; 
		
		Scanner kbd = new Scanner(System.in); 
		
		while(exitFcn == false) {
			
		System.out.println("Make a selection from the menu:\n" +
				"1. Create a character\n" +
				"2. Load a character\n" +
				"3. Print a character\n" +
				"4. Exit");
		
		userInput = kbd.nextInt(); 
		
			if(userInput == 1) {
				Character newCharacter = new Character(); 
				newCharacter.createCharacter(); 
			}
		
	/*		if(userInput == 2) {
				Load oldCharacter = new Load(); 
			}
		
			if(userInput == 3) {
				Printer profile = new Printer(); 
			}
	*/	
			if(userInput == 4) {
				exitFcn = true; 
			}
		
		}

	}


}
