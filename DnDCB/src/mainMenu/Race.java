package mainMenu;
import java.util.Scanner; 

public class Race {
	
	Scanner kbd  = new Scanner(System.in); 
	private int raceChoice = 0;   // 1 - Dwarf, 2 - Elf, 3 - Gnome, 4 - Half-Elf, 5 - Halfling, 6 - Human
	private String race = ""; 
	private String gender; 
	
	public int raceSelection() {
		
		System.out.println("Choose your race: \n" +
				"1. Dwarf\n" +
				"2. Elf\n" +
				"3. Gnome\n" +
				"4. Half-Elf\n" +
				"5. Halfling\n" +
				"6. Human \n"); 
		
		raceChoice = kbd.nextInt(); 
		
		return raceChoice;
	}
	
	public void genderSelection() {
		
		System.out.println("Choose your gender: \n"
				+ "1. Male \n" 
				+ "2. Female\n");
		
		int choice = kbd.nextInt(); 
		
		if(choice == 1){
			gender = "Male";
		}
		
		else{
			gender = "Female"; 
		}
	}

	public boolean raceCheck(int selectedRace, int[] attributes) {
		boolean raceCondition = false; 
		
		if(selectedRace == 1) { //Dwarf
			raceCondition =	(attributes[0] >= 8) && (attributes[0] <= 18) && (attributes[1] >= 3) && (attributes[1] <= 17) 
					&& (attributes[2] >= 11) && (attributes[2] <= 18) && (attributes[3] >= 3) 
					&& (attributes[3] <= 18) && (attributes[4] >= 3) && (attributes[4] <= 18) 
					&& (attributes[5] >= 3) && (attributes[5] <= 17); 
		}
		
		else if(selectedRace == 2) { //Elf
			raceCondition = (attributes[0] >= 3) && (attributes[0] <= 18) && (attributes[1] >= 6) && (attributes[1] <= 18) 
					&& (attributes[2] >= 7) && (attributes[2] <= 18) && (attributes[3] >= 8) 
					&& (attributes[3] <= 18) && (attributes[4] >= 3) && (attributes[4] <= 18) 
					&& (attributes[5] >= 8) && (attributes[5] <= 18); 
		}
		
		else if(selectedRace == 3) { //Gnome
			raceCondition = (attributes[0] >= 6) && (attributes[0] <= 18) && (attributes[1] >= 3) && (attributes[1] <= 18) 
					&& (attributes[2] >= 8) && (attributes[2] <= 18) && (attributes[3] >= 6) 
					&& (attributes[3] <= 18) && (attributes[4] >= 3) && (attributes[4] <= 18) 
					&& (attributes[5] >= 3) && (attributes[5] <= 18); 
		}
		
		else if(selectedRace == 4) { //Half-Elf
			raceCondition = (attributes[0] >= 3) && (attributes[0] <= 18) && (attributes[1] >= 6) && (attributes[1] <= 18) 
					&& (attributes[2] >= 6) && (attributes[2] <= 18) && (attributes[3] >= 4) 
					&& (attributes[3] <= 18) && (attributes[4] >= 3) && (attributes[4] <= 18) 
					&& (attributes[5] >= 3) && (attributes[5] <= 18); 	
		}
		
		else if(selectedRace == 5) { //Halfling
			raceCondition = (attributes[0] >= 7) && (attributes[0] <= 18) && (attributes[1] >= 7) && (attributes[1] <= 18) 
					&& (attributes[2] >= 10) && (attributes[2] <= 18) && (attributes[3] >= 6) 
					&& (attributes[3] <= 18) && (attributes[4] >= 3) && (attributes[4] <= 17) 
					&& (attributes[5] >= 3) && (attributes[5] <= 18); 	
		}
		
		else if (selectedRace >= 6) {
			raceCondition = true; 
		}
		
		return raceCondition; 
	}
	
	public void generateRaceCharacteristics(int raceNumber){
		
		if(raceNumber == 1){       //Dwarf
			
		}
		
	}
	
	public int getRaceNumber() {
		return raceChoice; 
	}
	
	public String getRace() {
		switch (raceChoice) {
			case 1: race = "Dwarf"; 
			break;
			case 2: race = "Elf";
			break;
			case 3: race = "Gnome"; 
			break;
			case 4: race = "Half-Elf"; 
			break;
			case 5: race = "Halfling"; 
			break;
			case 6: race = "Human"; 
			break;			
		}
		return race; 
	}
	
	public void setGender(String sex){
		gender = sex; 
	}
	
	public String getGender(){
		return gender; 
	}


}



	
